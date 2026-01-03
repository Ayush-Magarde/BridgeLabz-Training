package com.universityCourseEnrollmentSystem;

public abstract class Student {

	protected int studentId;
	protected String name;
	private double gpa;
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	protected void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
    public double getGPA() {
        return gpa;
    }
    
    public void displayTranscript() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
    
    protected abstract void updateGPA(String grade);
}
