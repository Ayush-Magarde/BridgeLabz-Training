package com.day10.hospitalavl;

public class PatientNode {
    int arrivalTime;
    String name;
    int height;
    PatientNode left, right;

    public PatientNode(int arrivalTime, String name) {
        this.arrivalTime = arrivalTime;
        this.name = name;
        this.height = 1;
    }
}
