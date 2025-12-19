// Create a program to count the number of digits in an integer.

import java.util.Scanner;
class NumberOfDigits {
	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		// Take a number in input.
		System.out.print ("Enter a number: ");
		int number = input.nextInt();
		// Initialize count with 0.
		int count = 0;
		
		// Run a while loop until the number becomes zero
		while (number != 0) {
			// Increment count in each step
			count++;
			// Divide the number by 10 to remove the last digit
			number /= 10;
		}
		
		// Display the results
		System.out.println ("Number of digits: " + count);
	}
}