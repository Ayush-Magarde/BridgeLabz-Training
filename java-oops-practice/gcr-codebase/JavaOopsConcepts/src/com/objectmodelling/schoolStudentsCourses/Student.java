package com.objectmodelling.schoolStudentsCourses;

import java.util.ArrayList;
public class Student {

	private String name;
	private ArrayList<Course> courses = new ArrayList<>();
	
	public Student (String name) {
		this.name = name;
	}
	
	// Method to enroll in a course
	public void enrollCourse (Course course) {
		courses.add(course);
		course.addStudent(this);
	}
	
	// Method to view Courses
	public void viewCourses () {
		System.out.println("Courses enrolled by " + name + ": ");
		for (Course c : courses) {
			System.out.println(c.getCourseName());
		}
	}
	
	public String getName() {
		return name;
	}
}
