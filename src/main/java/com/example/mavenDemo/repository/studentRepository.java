package com.example.mavenDemo.repository;

import com.example.mavenDemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentRepository extends MongoRepository<Student, String> {

}

