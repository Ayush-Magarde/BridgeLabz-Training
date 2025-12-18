/* Write a program FizzBuzz, take a number as user input, and check for a positive integer. 
If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead 
of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz". */

import java.util.Scanner;
class FizzBuzzUsingFor {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
		// Take a number as input
        int number = input.nextInt();
		// Check if its a Natural number
        if (number > 0) {
			// Run a for loop from 1 till the number
            for (int i = 1; i <= number; i++) {
				// If i is a mutiple of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
				// If i is a multiple of 3
				else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
				// If i is a multiple of 5
				else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
				// If i isn't a mutiple of 3 or 5
				else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a positive integer");
        }
    }
}
