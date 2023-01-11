package com.AmanSagar.StudentCard.controllers;
import com.AmanSagar.StudentCard.modules.Student;
import com.AmanSagar.StudentCard.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;

@RestController
public class StudentController {

    @Autowired
    StudentService studentservice;

    @PostMapping("/add_Student")
    public ResponseEntity<String> add_student(@RequestBody() Student student){
        studentservice.add_student(student);
        return new ResponseEntity("Added Succespully",HttpStatus.OK);
    }
    @GetMapping("/get_student")
    public ResponseEntity<Student> get_student(@RequestParam("id") int id){
        return new ResponseEntity(studentservice.get_student(id),HttpStatus.OK);
    }
}
