// Rewrite the above program to find the power of a number using a while loop.

import java.util.Scanner;
class PowerUsingWhile {
	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("Enter the power: ");
		int power = input.nextInt();
		int counter = 0;
		int result = 1;
		while (counter != power) {
			result *= number;
			counter++;
		}
		System.out.println("Result: " + result);
	}
}
		