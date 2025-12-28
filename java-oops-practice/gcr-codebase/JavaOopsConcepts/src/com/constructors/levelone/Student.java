package com.constructors.levelone;

public class Student {
	
	// Access modifiers
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	public Student(int rollNumber, String name, double cgpa) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.cgpa = cgpa;
	}

	// Public getter for cgpa
	public double getCGPA() {
		return cgpa;
	}
	// Public setter for cgpa
	public void setCGPA (double cgpa) {
		this.cgpa = cgpa;
	}
	
}
