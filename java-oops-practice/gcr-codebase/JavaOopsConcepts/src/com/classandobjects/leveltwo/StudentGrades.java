package com.classandobjects.leveltwo;

public class StudentGrades {
	String name;
	String rollNumber;
	double[] marks;
	
	// Constructor
	StudentGrades(String name, String rollNumber, double[] marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	// Method to calculate grade
	public String calculateGrade(double[] marks ) {
		//variable to store the totalmarks
		double totalMarks = calculateTotalMarks(marks);
		
		// To check the grade of student
		if(totalMarks >= 80 && totalMarks<=100) {
			return "Grade A";
		}
		else if((totalMarks >=60)&&(totalMarks <80)){
			return "Grade B";
		}
		else if((totalMarks >=50)&&(totalMarks <60)) {
			return "Grade C";
		}
		else if((totalMarks >=40)&&(totalMarks <50)) {
			return "Grade D";
		} 
		else {
			return "Grade F";
		}
	}
	//Creating the method to display the students details
	public void displayStudent() {
		System.out.println("Student Name: " + name);
		
		System.out.println("Student RollNumber: " + rollNumber);
		
		System.out.println("Student Marks:");
		
		for(int i = 0; i < marks.length ; i++ ) {
			System.out.println("Mark" + (i+1) + " : "+ marks[i]);
		}
		
		System.out.println(calculateGrade(marks));
	}
	// Creating the method to calculate the totalmarks
	public double calculateTotalMarks(double[] marks) {
		double sum = 0;
		for(int i = 0; i < marks.length ; i++ ) {
			sum += marks[i];
		}
		return sum/3;
	}
	// Main method
	public static void main(String[] args) {
		// Variables to store the marks
		double[] mark1 = {80,70,75};
		double[] mark2 = {60,65,50};
		
		// object creating for constructor invoke
		StudentGrades student1 = new StudentGrades("Ayush", "Ab2321", mark1);
		StudentGrades student2 = new StudentGrades("Akash","Cd4234",mark2);
		
		//calling the display method
		student1.displayStudent();
		student2.displayStudent();
	}
}
