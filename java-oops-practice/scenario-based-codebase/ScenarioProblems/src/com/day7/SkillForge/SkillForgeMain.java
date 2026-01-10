package com.day7.SkillForge;

public class SkillForgeMain {

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Ayush", "ayush@skillforge.com");

        String[] modules = {"OOPS", "Collections", "Streams"};
        Course course = new Course("Java Fundamentals", instructor, "Beginner", modules);

        Student student = new Student("Aarya", "aarya@student.com");

        student.updateProgress(3, course.getTotalModules());

        course.displayCourse();
        student.generateCertificate(course);
    }
}
