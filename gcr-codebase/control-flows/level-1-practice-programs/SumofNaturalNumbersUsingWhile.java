/* Write a program to find the sum of n natural numbers using while loop compare the 
result with the formulae n*(n+1)/2 and show the result from both computations was correct. */

import java.util.Scanner;
class SumofNaturalNumbersUsingWhile {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Take a number in input 
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		if (number > 0) {
			// Find the sum till the number using the given formulae
			int sumUsingFormulae = ((number) * (number + 1)) / 2;
			System.out.println("Total sum till " + number + " using formulae: " + sumUsingFormulae);
			// Find the sum till the number using the while loop
			int sumUsingWhile = 0;
			int i = 1;
			while (i <= number) {
			sumUsingWhile += i;
			i++;
			}
			System.out.println("Total sum till " + number + " using while: " + sumUsingWhile);
		} else {
			System.out.println ("Not a natural number");
		}
	}
}
				
		