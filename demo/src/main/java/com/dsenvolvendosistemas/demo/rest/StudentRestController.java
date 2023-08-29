package com.dsenvolvendosistemas.demo.rest;

import com.dsenvolvendosistemas.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();
        
        theStudents.add(new Student("Rafael", "Calixto"));
        theStudents.add(new Student("Ronoroa", "Zoro"));
        theStudents.add(new Student("Ronaldinho", "Gaucho"));

        return theStudents;
    }
}