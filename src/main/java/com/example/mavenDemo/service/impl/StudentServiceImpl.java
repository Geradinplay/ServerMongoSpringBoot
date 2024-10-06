package com.example.mavenDemo.service.impl;

import com.example.mavenDemo.model.Student;
import com.example.mavenDemo.repository.studentDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final studentDAO repository;


    public List<Student> findAllStudent(){
        return repository.findAllStudent();
    }

    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    public Student findByIndex(String index) {
        return repository.findByIndex(index);
    }


    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }


    public Student deleteStudent(String index) {
        return repository.deleteStudent(index);
    }

}
