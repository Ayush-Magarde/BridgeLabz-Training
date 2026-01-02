package com.encapsulation.hospitalPatientManagement;

public class Main {

	public static void main(String[] args) {
		
		Patient p1 = new InPatient(101, "Aman", 23, 5, 2000);
		Patient p2 = new OutPatient(202, "Anika", 28, 500);
		
        ((MedicalRecord) p1).addRecord("Admitted for surgery");
        ((MedicalRecord) p2).addRecord("Routine check-up");

        Patient[] patients = {p1, p2};

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Total Bill: INR " + p.calculateBill());

            MedicalRecord mr = (MedicalRecord) p;
            mr.viewRecords();

            System.out.println();
        }
        
	}

}
