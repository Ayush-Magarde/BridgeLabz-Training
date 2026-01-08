package com.day4.EduMentor;

public class Instructor extends User {

    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    public void createCourse(String courseName) {
        System.out.println("Instructor " + name + " created course: " + courseName);
    }
}
