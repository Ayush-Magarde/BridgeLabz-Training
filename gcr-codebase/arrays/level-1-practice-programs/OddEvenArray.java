/* Create a program to save odd and even numbers into odd and even arrays 
between 1 to the number entered by the user. Finally, print the odd and 
even numbers array. */

import java.util.Scanner;
class OddEvenArray{
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		// Take user input for the number
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		// Exit the program if the number is zero or negative
		if (number <= 0) {
			System.out.println("ERROR");
		}
		// Make even and odd arrays, even and odd index variable
		int[] evenArray = new int [number / 2 + 1];
		int[] oddArray = new int [number / 2 + 1];
		int evenIndex = 0;
		int oddIndex = 0;
		// For loop running from 1 to the number
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				// Its an Even number
				evenArray[evenIndex] = i;
				evenIndex++;
			} else {
				// Its an Odd number
				oddArray[oddIndex] = i;
				oddIndex++;
			}
		}
		// Print the odd array
		System.out.println("The array of Odd numbers" );
		for (int i = 0; i < oddIndex; i++) {
			System.out.print(oddArray[i] + " ");
		}
		// Print the even array
		System.out.println("\nThe array of Even numbers" );
		for (int i = 0; i < evenIndex; i++) {
			System.out.print(evenArray[i] + " ");
		}
	}
}
		
		
		