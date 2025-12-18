// Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
class NumberTypeCheck {
	public static void main (String[] args) {
		
		// Take a number in input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		// Check if its positive, negative or zero.
		if (number == 0) {
		System.out.println("Zero");
		} else if (number > 0) {
		System.out.println("Positive");
		} else {
		System.out.println("Negative");
		}
	}
}