package com.springExample.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="SPRING_API_EMPLOYEE") 
@Entity
public class Employee {
    @Id
    private int id;
	
    @Column(name="FIRST_NAME")
    private String firstName;
	
    @Column(name="SECOND_NAME")
    private String secondName;
	
    @Column(name="EMAIL", nullable=false, unique=true) 
    private String email;
	
    @Column(name="PASSWORD") 
    private String password;
}
