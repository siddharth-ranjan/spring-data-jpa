package com.learn.spring.springdatajpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@AttributeOverrides({
        @AttributeOverride(
                name = "guardianFullName",
                column = @Column(name = "guardianFullName")
        ),
        @AttributeOverride(
                name = "address",
                column = @Column(name = "guardianAddress")
        )
})
public class Guardian {

    @Column(
            nullable = false
    )
    private String guardianFullName;


    @Column(
            nullable = false
    )
    private String guardianAddress;


}
