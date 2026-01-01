package com.inheritance.multilevelInheritance.educationalCourses;

public class Main {

    public static void main(String[] args) {

        PaidOnlineCourse course =
            new PaidOnlineCourse(
                "Java Programming",
                40,
                "Coursera",
                true,
                5000,
                20
            );

        course.displayDetails();
    }
}
