package com.example.the_template.service;

import com.example.the_template.model.Student;
import com.example.the_template.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class StudentService {
    private StudentRepository repository;
    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student addStudent(Student student){
        return repository.save(student);
    }

}
