// Rewrite the above program to print the greatest factor of a number beside itself using a while loop.

import java.util.Scanner;
class GreatestFactorWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		System.out.print ("Please enter a number: ");
        int number = input.nextInt();
		// Initialize a counter and greatest factor
        int counter = number - 1;
        int greatestFactor = 1;
		// Run a while loop till the counter reaches 1
        while (counter >= 1) {
			// Check if the counter divides the number clearly
            if (number % counter == 0) {
				// Update the value of greatest factor and break
                greatestFactor = counter;
                break;
            }
			// Decrement the counter
            counter--;
        }
		// Display the results
        System.out.println("Greatest Factor: " + greatestFactor);
    }
}
