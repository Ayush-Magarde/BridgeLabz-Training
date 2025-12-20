/* Rewrite the above program to store the marks of the students in physics, 
chemistry, and maths in a 2D array and then compute the percentage and grade. */

import java.util.Scanner;
class StudentGrades2d {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		// Create a variable for the number of students
		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		// Create a 2d array to store the marks in the 3 subjects
		int[][] marks = new int[students][3];
		double[] percentage = new double[students];
		String[] grades = new String[students];
		
		// Run a for loop to get marks from the user
		for (int i = 0; i < students; i++) {
			System.out.println("Enter for student " + (i+1));
			System.out.print("Physics Marks: ");
			marks[i][0] = input.nextInt();
			System.out.print("Chemistry Marks: ");
			marks[i][1] = input.nextInt();
			System.out.print("Math Marks: ");
			marks[i][2] = input.nextInt();	
			percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
			if (percentage[i] > 80.0) grades[i] = "A";
			else if (percentage[i] > 70.0) grades[i] = "B";
			else if (percentage[i] > 60.0) grades[i] = "C";
			else if (percentage[i] > 50.0) grades[i] = "D";
			else if (percentage[i] > 40.0) grades[i] = "E";
			else grades[i] = "R";
		}
		
		// Display the results
		for (int i = 0; i < students; i++) {
			System.out.println("Student " + (i+1) + " result");
			System.out.println ("Physics Marks: " + marks[i][0] + ", Chemistry Marks: " +  marks[i][1] + ", Math Marks: " + marks[i][2]);
			System.out.println ("Percentage : " + percentage[i]);
			System.out.println ("Grade: " + grades[i]);	
		}
	}
}