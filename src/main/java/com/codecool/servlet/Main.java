package com.codecool.servlet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController studentController= new StudentController();

        Student student = new Student(1, "M", "K", 39);
        Student student1 = new Student(2, "M", "K", 39);

        List<Student> students = new ArrayList<>();

        students.add(student);
        students.add(student1);

        studentController.delete(1);

        System.out.println(students.get(0).getFirstName());

    }
}
