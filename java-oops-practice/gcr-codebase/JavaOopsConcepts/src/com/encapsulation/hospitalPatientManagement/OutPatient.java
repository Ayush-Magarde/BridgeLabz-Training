package com.encapsulation.hospitalPatientManagement;

import java.util.ArrayList;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private ArrayList<String> medicalHistory = new ArrayList<>();

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : medicalHistory) {
            System.out.println("- " + r);
        }
    }
}
