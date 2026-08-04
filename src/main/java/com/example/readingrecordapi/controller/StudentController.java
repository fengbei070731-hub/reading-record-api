package com.example.readingrecordapi.controller;

import com.example.readingrecordapi.student.Student;
import com.example.readingrecordapi.student.StudentMemoryStore;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentMemoryStore studentMemoryStore;

    public StudentController(StudentMemoryStore studentMemoryStore) {
        this.studentMemoryStore = studentMemoryStore;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentMemoryStore.save(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentMemoryStore.findById(id);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentMemoryStore.findAll();
    }
}
