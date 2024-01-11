package com.learn.spring.springdatajpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Teacher {

    @Id
    private Long teacherId;

    @Column(
            nullable = false
    )
    private String fullName;


}
