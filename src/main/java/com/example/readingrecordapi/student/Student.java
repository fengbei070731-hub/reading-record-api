package com.example.readingrecordapi.student;

public class Student {

    private Long id;
    private String name;
    private Integer grade;
    private String className;

    public Student() {
    }

    public Student(Long id, String name, Integer grade, String className) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.className = className;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
