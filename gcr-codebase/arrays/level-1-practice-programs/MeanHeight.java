// Create a program to find the mean height of players present in a football team.
import java.util.Scanner;
class MeanHeight{
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Make an Array of size 11
		double[] heights = new double[11];
		// Initialize sum with 0
		double totalSumOfHeights = 0.0;
		
		// Run a for loop to take user input for heights and add them to total sum
		for (int i = 0; i < 11; i++) {
			System.out.print("Please enter the height in cms: ");
			heights[i] = input.nextDouble();
			totalSumOfHeights += heights[i];
		}
		
		// Calculate and display Mean height 
		System.out.println ("Mean height of 11 football players: " + (totalSumOfHeights/11));
	}
}
		
		
		
			
		