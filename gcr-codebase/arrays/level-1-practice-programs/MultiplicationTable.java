// Create a program to print a multiplication table of a number.

import java.util.Scanner;
class MultiplicationTable {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take a number in input
		System.out.print ("Please enter a number: ");
		int number = input.nextInt();
		// Create an Array of size 10
		int[] multiplicationArray = new int [10]; 
		
		// Run a for loop to fill the array with the multiples of the number
		for (int i = 0; i < multiplicationArray.length; i++) {
			multiplicationArray[i] = (i+1) * number;
		}
		// Print the elements of the array in the correct format
		for (int i = 0; i < multiplicationArray.length; i++) {
			System.out.println(number + " * " + (i+1) + " = " + multiplicationArray[i]);
		}
	}
}
		