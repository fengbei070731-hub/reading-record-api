package com.example.readingrecordapi.student;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Component;

@Component
public class StudentMemoryStore {

    private static final AtomicLong NEXT_ID = new AtomicLong(1);

    private final Map<Long, Student> studentMap = new LinkedHashMap<>();

    public Student save(Student student) {
        Long id = student.getId();
        if (id == null) {
            id = NEXT_ID.getAndIncrement();
            student.setId(id);
        }
        studentMap.put(id, student);
        return student;
    }

    public Student findById(Long id) {
        return studentMap.get(id);
    }

    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }
}
