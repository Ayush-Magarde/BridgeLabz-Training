package com.objectmodelling.schoolStudentsCourses;

import java.util.ArrayList;
public class School {
	
	private String schoolName;
	private ArrayList<Student> students = new ArrayList<> ();
	
	public School (String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void addStudents(Student student) {
		students.add(student);
	}
	
	public void viewStudents() {
		System.out.println("Students in " + schoolName + ": ");
		for (Student s : students) {
			System.out.println(s.getName());
		}
	}
} 
