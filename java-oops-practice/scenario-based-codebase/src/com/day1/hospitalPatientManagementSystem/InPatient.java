package com.hospitalPatientManagementSystem;

public class InPatient extends Patient {

    private int daysAdmitted;

    public InPatient(int id, String name, int age, int daysAdmitted) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: In-Patient");
        System.out.println("Days Admitted: " + daysAdmitted);
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }
}
