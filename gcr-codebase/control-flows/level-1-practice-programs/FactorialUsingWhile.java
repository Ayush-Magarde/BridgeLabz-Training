// Write a Program to find the factorial of an integer entered by the user.

import java.util.Scanner;
class FactorialUsingWhile {
	public static void main (String[] args) {
		
		// Take a number in input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number whose factorial you want to find: ");
		int number = input.nextInt();
		int factorial = 1;
		// Check if it is a Natutal Number
		if (number >= 1) {
			// Find the factorial using the while loop
			while (number > 1) {
				factorial *= number;
				number--;
			}
			System.out.println("The Factorial is: " + factorial);
		} else {
			System.out.println("Not a Natutal Number");
		}
	}
}
			