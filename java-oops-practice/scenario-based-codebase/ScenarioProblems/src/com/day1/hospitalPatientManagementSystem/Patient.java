package com.day1.hospitalPatientManagementSystem;

public class Patient {

    private int patientId;
    private String name;
    private int age;
    private String medicalHistory; // sensitive

    // Normal admission
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "Not Provided";
    }

    // Emergency admission (constructor overloading)
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    // Encapsulation
    public String getSummary() {
        return "Patient ID: " + patientId +
               ", Name: " + name +
               ", Age: " + age;
    }

    // Polymorphic method
    public void displayInfo() {
        System.out.println(getSummary());
    }
}
