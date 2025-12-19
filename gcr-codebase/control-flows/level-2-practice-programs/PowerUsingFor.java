// Create a program to find the power of a number.

import java.util.Scanner;
class PowerUsingFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		System.out.print ("Enter a number: ");
        int number = input.nextInt();
		System.out.print ("Enter the power: ");
        int power = input.nextInt();
		// Initialize the result variable
        int result = 1;
		// Run a for loop from one till power
        for (int i = 1; i <= power; i++) {
			// At each iteration, multiply the result to number
            result *= number;
        }
		
		// Display the result
        System.out.println("Result: " + result);
    }
}
