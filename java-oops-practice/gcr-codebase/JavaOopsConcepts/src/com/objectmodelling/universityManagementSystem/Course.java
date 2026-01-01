package com.objectmodelling.universityManagementSystem;

public class Course {
	
	private String courseName;
	private Professor professor;
	
	public Course (String courseName) {
		this.courseName = courseName;
	}
	
	public void assignProfessor(Professor professor) {
		this.professor = professor;
		System.out.println(professor.getName() + " assigned to " + courseName);
	}
	
	public String getCourseName() {
		return courseName;
	}
}
