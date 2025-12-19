// Create a program to find all the multiples of a number taken as user input below 100.

import java.util.Scanner;
class MultiplesUsingFor {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
		// Take a number below 100 in input
		System.out.print ("Please enter a number below 100: ");
        int number = input.nextInt();
		if (number > 0) {
			// Run a backwards for loop from 100 to 1
			for (int i = 100; i >= 1; i--) {
				// If i divides the number completely, print it
				if (i % number == 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println ("Not a positive natural number");
		}
    }
}
