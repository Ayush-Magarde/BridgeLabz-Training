package com.day3.CampusConnect;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {

    private ArrayList<Courses> courses;
    private int[] grades;   // private as required

    public Student(String name, String email, String id, int[] grades) {
        super(name, email, id);
        this.grades = grades;
        this.courses = new ArrayList<>();
    }

    // GPA calculation using operators
    public double calculateGPA() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    @Override
    public void enrollCourse(Courses course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Courses course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    // Polymorphism
    @Override
    public void displayDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("ID: " + getId());
        System.out.println("GPA: " + calculateGPA());
        System.out.println();
    }
}
