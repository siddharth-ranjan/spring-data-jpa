package com.learn.spring.springdatajpa.repository;

import com.learn.spring.springdatajpa.entities.Course;
import com.learn.spring.springdatajpa.entities.CourseMaterial;
import com.learn.spring.springdatajpa.entities.Guardian;
import com.learn.spring.springdatajpa.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveStudent(){
        Guardian guardian = Guardian.builder()
                .guardianFullName("G sharma")
                .guardianAddress("Patna")
                .build();

        Student student = Student.builder()
                .firstName("S")
                .lastName("Sharma")
                .emailId("ssharma@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }


    @Test
    public void saveCourseMaterial(){
        Course course = Course.builder()
                .courseName("Spring")
                .credit((short) 3)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("spring.com")
                .course(course)
                .build();


        courseMaterialRepository.save(courseMaterial);
        System.out.println("courseMaterial = " + courseMaterial);
    }

}