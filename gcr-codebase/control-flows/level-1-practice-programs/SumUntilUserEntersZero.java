// Write a program to find the sum of numbers until the user enters 0

import java.util.Scanner;
class SumUntilUserEntersZero {
	public static void main (String[] main) {
		// Take input and store it in value
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		System.out.println("Keep entering values: "); 
		double value = input.nextDouble();
		while (value != 0) {
			// While loops keeps adding value to total until the user enters zero
			total += value;
			value = input.nextDouble();
		}
		System.out.println("The total sum: " + total);
	}
}