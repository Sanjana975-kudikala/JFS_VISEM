package com.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            StudentDAO dao = new StudentDAO();

            while (true) {
                System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Semester: ");
                        String sem = sc.nextLine();
                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        dao.addStudent(new Student(name, sem, dept));
                        System.out.println("Student added successfully!");
                        break;

                    case 2:
                        List<Student> students = dao.getAllStudents();
                        for (Student s : students) {
                            System.out.println(s);
                        }
                        break;

                    case 3:
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("New Name: ");
                        String n = sc.nextLine();
                        System.out.print("New Semester: ");
                        String se = sc.nextLine();
                        System.out.print("New Department: ");
                        String d = sc.nextLine();

                        Student st = new Student();
                        st.setId(id);
                        st.setName(n);
                        st.setSem(se);
                        st.setDept(d);

                        dao.updateStudent(st);
                        System.out.println("Student updated!");
                        break;

                    case 4:
                        System.out.print("Enter Student ID to delete: ");
                        dao.deleteStudent(sc.nextInt());
                        System.out.println("Student deleted!");
                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
