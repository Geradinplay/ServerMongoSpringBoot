package com.example.mavenDemo.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Builder

@Document(collection = "students")
public class Student {
    private String name;
    private String sureName;
    private String index;

    public Student(String name, String sureName, String index) {
        this.name = name;
        this.sureName = sureName;
        this.index = index;
    }


}

