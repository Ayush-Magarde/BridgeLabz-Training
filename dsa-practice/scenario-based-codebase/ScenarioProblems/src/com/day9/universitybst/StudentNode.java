package com.day9.universitybst;

public class StudentNode {
    int roll;
    String name;
    StudentNode left, right;

    public StudentNode(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
