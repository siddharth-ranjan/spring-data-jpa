package com.learn.spring.springdatajpa.repository;

import com.learn.spring.springdatajpa.entities.Course;
import com.learn.spring.springdatajpa.entities.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {
}
