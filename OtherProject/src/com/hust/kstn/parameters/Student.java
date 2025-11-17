package com.hust.kstn.parameters;

public class Student {
    private int studentId = 0;
    private String name;

    // constructors
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    //methods
    public int getStudentID() {
        return this.studentId;
    }
    
    public String getName() {
        return this.name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
