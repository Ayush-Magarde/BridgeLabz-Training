package com.day4.hospitalqueue;

public class HospitalQueue {

    private Patient[] patients;
    private int size;

    public HospitalQueue(int capacity) {
        patients = new Patient[capacity];
        size = 0;
    }

    public void addPatient(Patient p) {
        patients[size++] = p;
    }

    // Bubble Sort by criticality (descending)
    public void sortByCriticality() {

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {

                if (patients[j].criticality < patients[j + 1].criticality) {
                    // swap adjacent patients
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    public void displayPatients() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }
}
