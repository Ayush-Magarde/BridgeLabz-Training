package com.day3.CampusConnect;

public class Main {

    public static void main(String[] args) {

        Faculty faculty = new Faculty("Dr. Sharma", "sharma@uni.edu", "F101");

        Courses javaCourse = new Courses("Java Programming", faculty);

        int[] grades = {80, 85, 90};
        Student student = new Student("Ayush", "ayush@uni.edu", "S201", grades);

        student.enrollCourse(javaCourse);

        // Polymorphism
        Person p1 = student;
        Person p2 = faculty;

        p1.displayDetails();
        p2.displayDetails();

        javaCourse.displayCourseDetails();
    }
}
