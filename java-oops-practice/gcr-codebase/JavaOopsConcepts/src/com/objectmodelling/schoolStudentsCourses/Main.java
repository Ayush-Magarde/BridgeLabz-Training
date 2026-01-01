package com.objectmodelling.schoolStudentsCourses;

public class Main {
	public static void main (String[] args) {
		School school = new School("Abc International School");
		
		Student student1 = new Student("Ayush");
		Student student2 = new Student("Aman");
		
		Course course1 = new Course("Java");
		Course course2 = new Course("Python");
		
		school.addStudents(student1);
		school.addStudents(student2);
		
		student1.enrollCourse(course1);
		student1.enrollCourse(course2);
		student2.enrollCourse(course2);
		
		student1.viewCourses();
		course1.viewStudents();
		course2.viewStudents();
	}
}
