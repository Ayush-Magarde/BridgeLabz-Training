// Create a program to check if a number taken from the user is a Harshad Number.

import java.util.Scanner;
class HarshadNumberCheck {
	public static void main ( String[] args) {
		Scanner input = new Scanner(System.in);
		// Take a number in input
		System.out.println ("Enter a number: ");
		int number = input.nextInt();
		// Initialize the sum with 0
		int sum = 0;
		// Make a copy of the number
		int originalNumber = number;
		
		// Run the while loop until the number becomes zero
		while (originalNumber != 0) {
			sum += originalNumber%10;
			originalNumber /= 10;
		}
		
		//Display the results
		if (number % sum == 0 ) {
			System.out.println ("Harshad Number");
		} else {
			System.out.println ("Not a Harshad Number");
		}
	}
}
		