package com.hust.kstn.parameters;

public class TestingParameters {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        System.out.println("First student: " + s1.getName());
        System.out.println("Second student: " + s2.getName());
        swap(s1, s2);
        System.out.println("First student: " + s1.getName());
        System.out.println("Second student: " + s2.getName());
    }

    public static void swap(Student o1, Student o2) {
        int tmp = o1.getStudentID();
        o1.setStudentId(o2.getStudentID());
        o2.setStudentId(tmp);

        String bq = o1.getName();
        o1.setName(o2.getName());
        o2.setName(bq);
    }
}