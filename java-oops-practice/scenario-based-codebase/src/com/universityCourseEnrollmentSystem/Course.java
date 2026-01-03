package com.universityCourseEnrollmentSystem;

public class Course {

    private String courseCode;
    private String courseName;
    private int credits;

    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }
    
    public void displayCourse() {
        System.out.println(courseCode + " - " + courseName + " (" + credits + " credits)");
    }
}
