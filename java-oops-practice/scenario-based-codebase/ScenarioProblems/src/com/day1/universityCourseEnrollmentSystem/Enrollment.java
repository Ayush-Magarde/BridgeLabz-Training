package com.day1.universityCourseEnrollmentSystem;

public class Enrollment implements Graded{

	private Student student;
	private Course course;
	private String grade;
	
	public Enrollment(Student student, Course course) {
		this.student = student;
		this.course = course;
	}
	
	@Override
	public void assignGrade(String grade) {
		this.grade = grade;
		student.updateGPA(grade);
	}
	
	public void displayEnrollment() {
		student.displayTranscript();
		course.displayCourse();
		System.out.println("Grade: " + grade);
		System.out.println();
	}
}
