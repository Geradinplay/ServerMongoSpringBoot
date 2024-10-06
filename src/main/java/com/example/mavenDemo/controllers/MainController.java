package com.example.mavenDemo.controllers;
import com.example.mavenDemo.model.Student;
import com.example.mavenDemo.model.TextObject;
import com.example.mavenDemo.service.impl.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor //что бы не писать autowired много раз
public class MainController {
//    @Autowired
    private StudentService studentService;

        @GetMapping("/text")
        public TextObject text() {
            TextObject textObject = new TextObject("Text tested");
            return textObject;
        }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> findAllStudents() {
            List<Student> students = studentService.findAllStudent();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(students);
    }

    @PostMapping("save_student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){

            if (student==null) {
                return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
            }
            studentService.saveStudent(student);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(student);
    }

    @GetMapping("/{index}")
    public ResponseEntity<Student> findByIndex(@PathVariable String index){

            var student = studentService.findByIndex(index);

            if(student==null){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            return  ResponseEntity.status(HttpStatus.ACCEPTED).body(student);
    }

    @PutMapping("update_student")
    public Student updateStudent(Student student){
            return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{index}")
    public Student deleteStudent(String index){
            return studentService.deleteStudent(index);
    }
}
