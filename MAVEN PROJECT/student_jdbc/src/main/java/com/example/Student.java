package com.example;

public class Student {
    private int id;
    private String name;
    private String sem;
    private String dept;

    // Constructors
    public Student() {}
    public Student(String name, String sem, String dept) {
        this.name = name;
        this.sem = sem;
        this.dept = dept;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSem() { return sem; }
    public void setSem(String sem) { this.sem = sem; }

    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ",sem=" + sem + ", dept=" + dept + "]";
    }
}
