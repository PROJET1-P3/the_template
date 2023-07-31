package com.example.the_template.controller;

import com.example.the_template.model.Student;
import com.example.the_template.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    private StudentService service;
    @GetMapping(value = "/students")
    public List<Student> getUsers(){
        return service.getStudents();
    }

    @PostMapping(value="/student")
    public Student addUser(@RequestBody Student student){
        return service.addStudent(student);
    }
}