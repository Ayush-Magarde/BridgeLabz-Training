package com.streamapi.doctoravailability;

import java.util.Arrays;
import java.util.List;

public class DoctorAvailabilityMain {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Sharma", "Cardiology", true),
                new Doctor("Dr. Mehta", "Orthopedics", false),
                new Doctor("Dr. Khan", "Neurology", true),
                new Doctor("Dr. Verma", "Dermatology", true),
                new Doctor("Dr. Iyer", "Pediatrics", false)
        );

        System.out.println("Doctors available on weekends (sorted by specialty):");

        doctors.stream()
                .filter(Doctor::isAvailableOnWeekend)
                .sorted((d1, d2) -> d1.getSpecialty()
                        .compareToIgnoreCase(d2.getSpecialty()))
                .forEach(System.out::println);
    }
}
