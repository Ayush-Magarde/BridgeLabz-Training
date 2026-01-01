package com.objectmodelling.hospitalSystem;

import java.util.ArrayList;
public class Patient {

	private String name;
	private ArrayList<Doctor> doctors = new ArrayList<> ();
	
	public Patient(String name) {
		this.name = name;
	}
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	
	public String getName() {
		return name;
	}
}
