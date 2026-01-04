package com.day1.universityCourseEnrollmentSystem;

public class Postgraduate extends Student {

    public Postgraduate(int studentId, String name) {
        super(studentId, name);
    }
    
    @Override
    protected void updateGPA(String grade) {
        if (grade.equalsIgnoreCase("Pass")) {
            setGPA(4.0);
        } else {
            setGPA(0.0);
        }
    }
}
