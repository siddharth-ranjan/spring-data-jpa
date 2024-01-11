package com.learn.spring.springdatajpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CourseMaterial {

    @SequenceGenerator(
            name = "courseMaterial_sequence",
            sequenceName = "courseMaterial_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "courseMaterial_sequence"
    )
    @Id
    private Long courseMaterialId;

    private String url;


    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "courseId",
            referencedColumnName = "courseId"
    )
    private Course course;
}
