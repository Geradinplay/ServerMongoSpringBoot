package com.example.mavenDemo.repository;

import com.example.mavenDemo.model.Student;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

@Repository
public class StudentDAO {

    private final List<Student> STUDENTS = new ArrayList<>();


    public List<Student> findAllStudent(){
        return STUDENTS;
    }

    public Student findByIndex(String index) {
        return STUDENTS.stream()
                .filter(e -> e.getIndex().equals(index))
                .findFirst()
                .orElse(null);
    }

    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(i -> STUDENTS.get(i).getIndex().equals(student.getIndex()))
                .findFirst()
                .orElse(-1);
        if(studentIndex>-1){
            STUDENTS.set(studentIndex, student);
        }
        return null;
    }

    public Student deleteStudent(String index) {
        var student = findByIndex(index);
        if (student!=null){
            STUDENTS.remove(student);
            return  student;
        }
        return null;
    }
}
