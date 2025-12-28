package com.constructors.levelone;

public class StudentMain {

	public static void main(String[] args) {
		PostgraduateStudent student1 = new PostgraduateStudent(100, "Ayush", 8.5, "CSE");
		student1.displayDetails();
		
		// Modifying cgpa using public method
		student1.setCGPA(9.5);
		
		System.out.println("New cgpa: " + student1.getCGPA());
	}

}
