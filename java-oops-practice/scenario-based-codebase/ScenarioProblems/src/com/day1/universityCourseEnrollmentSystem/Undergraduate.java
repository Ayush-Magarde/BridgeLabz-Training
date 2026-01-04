package com.day1.universityCourseEnrollmentSystem;

public class Undergraduate extends Student {

    public Undergraduate(int studentId, String name) {
        super(studentId, name);
    }
    
    @Override
    protected void updateGPA(String grade) {
        double points = 0;

        switch (grade) {
            case "A" -> points = 4.0;
            case "B" -> points = 3.0;
            case "C" -> points = 2.0;
            default -> points = 0.0;
        }

        setGPA(points);
    }
}
