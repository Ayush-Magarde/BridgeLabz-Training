package com.day4.hospitalqueue;

public class Patient {

	String name;
	int criticality; // 1-10
	
	public Patient(String name, int criticality) {
		this.name = name;
		this.criticality = criticality;
	}
	
	@Override
	public String toString() {
		return name + " (Criticality: " + criticality + ")";
	}
}
