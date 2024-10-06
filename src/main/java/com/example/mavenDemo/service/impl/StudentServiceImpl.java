package com.example.mavenDemo.service.impl;

import com.example.mavenDemo.model.Student;
import com.example.mavenDemo.repository.StudentDAO;
import com.example.mavenDemo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentDAO repository;
    private final StudentRepository studentRepository;


    public List<Student> findAllStudent(){return studentRepository.findAll();}

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
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
