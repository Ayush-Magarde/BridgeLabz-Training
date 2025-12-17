/* Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each 
student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.*/

public class PenPerStudent {
	public static void main (String[] args) {
	
		// Create two variables for total pens and total students respectively.
		int totalPens = 14;
		int totalStudents = 3;
		// Find pens per student and remaining pens
		int penPerStudent = totalPens / totalStudents;
		int nonDistributedPens = totalPens % totalStudents;
		
		// Display the results
		System.out.println("The Pen Per Student is: " + penPerStudent + 
		" and the remaining pen not distributed is: " + nonDistributedPens);
		
	}
}