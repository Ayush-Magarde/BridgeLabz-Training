package com.day4.FitTrack;

public class UserProfile {

    private String name;
    private int age;
    private double weight;     // protected via encapsulation
    private int dailyGoal;     // calorie goal

    // Constructor with default goal
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, 2000);
    }

    // Constructor with custom goal
    public UserProfile(String name, int age, double weight, int dailyGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyGoal = dailyGoal;
    }

    // Getter (no setter for weight → protected health data)
    public double getWeight() {
        return weight;
    }

    public int getDailyGoal() {
        return dailyGoal;
    }

    public void displayProfile() {
        System.out.println(name + " | Age: " + age + " | Daily Goal: " + dailyGoal + " kcal");
    }
}
