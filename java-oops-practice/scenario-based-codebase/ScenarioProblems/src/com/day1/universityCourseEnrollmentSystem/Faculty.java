package com.day1.universityCourseEnrollmentSystem;

public class Faculty {

	private String facultyName;
	
	public Faculty(String facultyName) {
		this.facultyName = facultyName;
	} 
	
	public void assignGrade(Graded enrollment, String grade) {
		enrollment.assignGrade(grade);
	}
}
