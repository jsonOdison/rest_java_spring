package com.jasonRestPract.yes.JasonRestPract.controller;

import com.jasonRestPract.yes.JasonRestPract.entities.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students = new ArrayList<>();

    @PostConstruct
    public void loadStudents() {
        students = new ArrayList<Student>();
        students.add(new Student("Poornima", "Patel"));
        students.add(new Student("Jason", "Khongwir"));
    }

    //define endpoint for students
    @GetMapping("/students")
    public List<Student> getStudents() {

        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return this.students.get(studentId);
    }
}
