// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM

// Create a class SamAverageMarks to show that it calcuates sam's average marks in math, physics, and chemistry.
public class SamAverageMarks {
	public static void main (String[] args) {
	
		// Create three integer varaibles and assign the marks.
		int mathMarks = 94;
		int physicsMarks = 95;
		int chemistryMarks = 96;
		
		// Create an integer varaible to calculate the average marks.
		int averageMarks = (mathMarks + physicsMarks + chemistryMarks)/3;
		
		// Display sam's average marks.
		System.out.println("Sam’s average mark in PCM is: " + averageMarks);
	}
}
	