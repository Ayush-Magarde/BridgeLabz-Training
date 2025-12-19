/* Write a program to input marks and 3 subjects physics, chemistry and maths. 
Compute the percentage and then calculate the grade as per the guidelines. */

import java.util.Scanner;
class StudentGradesCalculation {
	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter Physics marks: " );
		double physicsMarks = input.nextDouble();
		System.out.print ("Enter Chemistry marks: " );
		double chemistryMarks = input.nextDouble();
		System.out.print ("Enter Math marks: " );
		double mathMarks = input.nextDouble();
		
		// Calculate percentage
		double percentage = (physicsMarks+chemistryMarks+mathMarks) / 3;
		if (percentage >= 80) {
		System.out.println ("Grade: A" + "\nRemarks: Level 4, above agency-normalized standards");
		} else if (percentage >= 70 && percentage < 80) {
		System.out.println ("Grade: B" + "\nRemarks: Level 3, agency-normalized standards");
		} else if (percentage >= 60 && percentage < 70) {
		System.out.println ("Grade: C" + "\nRemarks: Level 2, below, but approaching agency-normalized standards");
		} else if (percentage >= 50 && percentage < 60) {
		System.out.println ("Grade: D" + "\nRemarks: Level 1, well below agency-normalized standards");
		} else if (percentage >= 40 && percentage < 50) {
		System.out.println ("Grade: E" + "\nRemarks: Level 1-, too below agency-normalized standards");
		} else {
		System.out.println ("Grade: R" + "\nRemarks: Remedial standards");
		}
	}
}
		