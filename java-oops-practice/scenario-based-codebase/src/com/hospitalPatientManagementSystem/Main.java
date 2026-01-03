package com.hospitalPatientManagementSystem; 

public class Main {

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Aman", 21, 5);
        Patient p2 = new OutPatient(102, "Rahul", 23);

        Doctor d1 = new Doctor(1, "Dr. Sharma", "Cardiology");

        Payable bill = new Bill(20000);

        // Polymorphism
        p1.displayInfo();
        System.out.println();

        p2.displayInfo();
        System.out.println();

        d1.displayInfo();
        System.out.println();

        System.out.println("Total Bill Amount: INR " + bill.calculatePayment());
    }
}
