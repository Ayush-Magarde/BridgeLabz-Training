package com.objectmodelling.hospitalSystem;

import java.util.ArrayList;
public class Hospital {

	private String hospitalName;
	private ArrayList<Doctor> doctors = new ArrayList<> ();
	private ArrayList<Patient> patients = new ArrayList<> ();
	
	public Hospital(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
}
