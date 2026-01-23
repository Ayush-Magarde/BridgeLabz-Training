package com.day7.eduresults;

public class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " | Marks: " + score;
    }
}
