// Create a program to find the factors of a number taken as user input.

import java.util.Scanner;
class FactorsUsingFor {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
		// Take a number in input
		System.out.print("Enter a number: ");
        int number = input.nextInt();
		// Check if its a positive integer or not
        if (number > 0) {
            for (int i = 1; i < number; i++) {
				// In every iteration check if the number is divisible by i or not.
                if (number % i == 0) {
                    System.out.println(number + " is divisible by: " + i);
                }
            }
        }
    }
}
