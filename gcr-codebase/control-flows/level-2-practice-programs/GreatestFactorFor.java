// Create a program to print the greatest factor of a number beside itself using a loop.

import java.util.Scanner;
class GreatestFactorFor {
    public static void main(String[] args) {
	
		// Take a number in input
        Scanner input = new Scanner(System.in);
		System.out.print ("Please enter a number: ");
        int number = input.nextInt();
        int greatestFactor = 1;
		// Run a for loop, till less than number
        for (int i = number - 1; i >= 1; i--) {
			// If i divides the number completely, update the value of the greatestFactor
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
		// Display the Greatest Factor in result
        System.out.println("Greatest Factor: " + greatestFactor);
        input.close();
    }
}
