package com.day7.SkillForge;

public class Course {

    private String title;
    private Instructor instructor;
    private String level;        // 🔥 THIS is where "level" belongs
    private String[] modules;

    private double rating;       // encapsulated
    private final String[] reviews; // read-only

    // Default modules constructor
    public Course(String title, Instructor instructor, String level) {
        this(title, instructor, level, new String[]{"Intro", "Core", "Final"});
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, String level, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = modules;
        this.rating = 0.0;
        this.reviews = new String[]{"Great course", "Very helpful"};
    }

    // Protected rating logic
    protected void updateRating(int totalScore, int users) {
        rating = (double) totalScore / users;
    }

    public int getTotalModules() {
        return modules.length;
    }

    public String getLevel() {
        return level;
    }

    public void displayCourse() {
        System.out.println(
                title +
                " | Level: " + level +
                " | Instructor: " + instructor.name +
                " | Modules: " + modules.length +
                " | Rating: " + rating
        );
    }
}
