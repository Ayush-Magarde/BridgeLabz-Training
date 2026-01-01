package com.objectmodelling.universityManagementSystem1;

public class Course {
	
	private String courseName;
	private Professor professor;
	
	public Course (String name) {
		this.courseName = name;
	}
	
	public void assignPorfessor(Professor professor) {
		this.professor = professor;
		System.out.println(professor.getName() + " assigned to " + courseName);
	}
	
	public String getCourseName() {
		return courseName;
	}
}
