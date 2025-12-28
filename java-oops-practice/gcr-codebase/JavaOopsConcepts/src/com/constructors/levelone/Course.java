package com.constructors.levelone;

public class Course {
	String courseName;
	int duration;
	int fee;
	static String instituteName = " ABC Institute";
	
	// Constructor
	public Course(String courseName, int duration, int fee) {
		this.courseName= courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	// Instance method to display course details
	public void displayCourseDetails() {
		System.out.println("Institute Name: " + instituteName);
		System.out.println("Course Name: " + courseName);
		System.out.println("Course duration: " + duration);
		System.out.println("Course fee: " + fee);
	}
	
	// Class method to update institute name for all courses
	public static void updateInstituteName (String newInstituteName) {
		instituteName = newInstituteName;
	}
}
