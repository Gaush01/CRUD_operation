package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Employee {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

}
