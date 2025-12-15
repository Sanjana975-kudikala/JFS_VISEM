package com.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            StudentDAO dao = new StudentDAO();

            // Add student
            Student s1 = new Student("John Doe", "VI sem","CSE");
            dao.addStudent(s1);
            System.out.println("Student Added Successfully!");

            // Fetch student
            List<Student> students = dao.getAllStudents();
            for (Student e : students) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
