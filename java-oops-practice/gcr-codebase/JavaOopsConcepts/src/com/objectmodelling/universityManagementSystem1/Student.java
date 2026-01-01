package com.objectmodelling.universityManagementSystem1;

import java.util.ArrayList;
public class Student {

	private String name;
	private ArrayList<Course> courses = new ArrayList<> ();
	
	public Student (String name) {
		this.name = name;
	}
	
	public void enrollCourse(Course course) {
		courses.add(course);
		System.out.println(name + " enrolled in " + course.getCourseName());
	}
	
	public String getName() {
		return name;
	}
}
