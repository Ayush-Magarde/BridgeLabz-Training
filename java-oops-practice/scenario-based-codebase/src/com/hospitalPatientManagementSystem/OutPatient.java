package com.hospitalPatientManagementSystem;

public class OutPatient extends Patient {


    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Out-Patient");
    }
}
