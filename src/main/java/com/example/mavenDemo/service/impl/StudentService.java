package com.example.mavenDemo.service.impl;

import com.example.mavenDemo.model.Student;

import java.util.List;

public interface StudentService {
        List<Student> findAllStudent();
        Student saveStudent(Student student);
        Student findByIndex(String index);
        Student updateStudent(Student student);
        Student deleteStudent(String index);
}