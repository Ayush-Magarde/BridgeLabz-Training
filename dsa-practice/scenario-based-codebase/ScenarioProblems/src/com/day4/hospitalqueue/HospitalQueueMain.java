package com.day4.hospitalqueue;

public class HospitalQueueMain {

    public static void main(String[] args) {

        HospitalQueue queue = new HospitalQueue(10);

        queue.addPatient(new Patient("Ayush", 1));
        queue.addPatient(new Patient("Neha", 9));
        queue.addPatient(new Patient("Ravi", 6));
        queue.addPatient(new Patient("Aarya", 10));
        queue.addPatient(new Patient("Karan", 3));

        System.out.println("Before Sorting:");
        queue.displayPatients();

        queue.sortByCriticality();

        System.out.println("\nAfter Sorting by Criticality:");
        queue.displayPatients();
    }
}
