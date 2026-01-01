package com.objectmodelling.schoolStudentsCourses;

import java.util.ArrayList;
public class Course {
	
	private String courseName;
	private ArrayList<Student> students = new ArrayList<> ();
	
	public Course (String courseName) {
		this.courseName = courseName;
	}
	
	// Method to enroll student in the course
	public void addStudent (Student student) {
		students.add(student);
	}
	
	public void viewStudents() {
		System.out.println("Students enrolled in: " + courseName + ": ");
		for (Student s : students) {
			System.out.println(s.getName());
		}
	}
	
	public String getCourseName () {
		return courseName;
	}
}
