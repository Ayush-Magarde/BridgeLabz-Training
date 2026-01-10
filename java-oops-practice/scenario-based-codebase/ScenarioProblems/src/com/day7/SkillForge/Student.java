package com.day7.SkillForge;

public class Student extends User implements ICertifiable {

    private int progress; // %

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    // Operator usage for progress tracking
    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules;
    }

    @Override
    public void generateCertificate(Course course) {
        if (progress < 100) {
            System.out.println("Course not completed yet.");
            return;
        }

        // Polymorphism via course level
        if (course.getLevel().equalsIgnoreCase("Beginner")) {
            System.out.println("Beginner Course Certificate issued to " + name);
        } else if (course.getLevel().equalsIgnoreCase("Advanced")) {
            System.out.println("Advanced Course Certificate issued to " + name);
        }
    }
}
