package com.constructors.levelone;

public class PostgraduateStudent extends Student {
	
	String specialization;
	
	// Constructor
	public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
		super(rollNumber, name, cgpa);
		this.specialization = specialization;
	}
	
	// Method to display details
	public void displayDetails() {
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Name: " + name);
		System.out.println("CGPA: " + getCGPA());
		System.out.println("Specialization: " + specialization);
	
	}
}
