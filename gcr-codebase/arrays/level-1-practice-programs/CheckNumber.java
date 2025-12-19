/* Write a program to take user input for 5 numbers and check 
whether a number is positive,  negative, or zero. Further for 
positive numbers check if the number is even or odd. Finally 
compare the first and last elements of the array and display 
if they equal, greater or less. */

import java.util.Scanner;
class CheckNumber {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Create an Array of 5 size
		int[] array = new int[5];
		
		// Run a for loop to fill the array
		for (int i = 0; i < array.length; i++) {
			// Take input from the user
			System.out.print("Please enter the " + (i+1) + " number: "); 
			array[i] = input.nextInt();
		}
		// Run a for loop to check each number
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				System.out.println(array[i] + ": Zero");
			} else if (array[i] > 0) {
				if (array[i] % 2 == 0) {
					System.out.println(array[i] + " is a positive even number");
				} else {
					System.out.println(array[i] + " is a positive odd number");
				}
			} else {
				System.out.println(array[i] + " is a negative number");
			}
		}
		// Compare the first and the last element of the array
		if (array[0] > array[4]) {
			System.out.println ("first element > last element");
		} else if (array[0] < array[4]) {
			System.out.println ("first element < last element");
		} else {
			System.out.print ("first element = last element");
		}
	}
}
					
					
			
		