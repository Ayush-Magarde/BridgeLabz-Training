package com.objectmodelling.hospitalSystem;

public class Main {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital("City Hospital");
		
		Doctor doctor1 = new Doctor ("Dr. Sharma");
		Doctor doctor2 = new Doctor ("Dr. Verma");
		
		Patient patient1 = new Patient("Aman");
		Patient patient2 = new Patient("Anika");
		
		hospital.addDoctor(doctor1);
		hospital.addDoctor(doctor1);
		
		hospital.addPatient(patient1);
		hospital.addPatient(patient2);
		
		doctor1.consult(patient1);
		doctor1.consult(patient2);
		
		doctor2.consult(patient2);
	}
}
