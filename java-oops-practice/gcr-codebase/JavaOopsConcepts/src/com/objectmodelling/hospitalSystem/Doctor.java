package com.objectmodelling.hospitalSystem;

import java.util.ArrayList;
public class Doctor {
	
	private String name;
	private ArrayList<Patient> patients = new ArrayList<> ();
	
	public Doctor (String name) {
		this.name = name;
	}
	
	public void consult(Patient patient) {
		patients.add(patient);
		System.out.println(name + " is consulting " + patient.getName());
	}
	
	public String getName() {
		return name;
	}
}
