// Rewrite the program to find all the multiples of a number below 100 using while loop

import java.util.Scanner;
class MultiplesUsingWhile {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive number less than 100: ");
		int number = input.nextInt();
		if (number > 0 && number < 100) {
			int counter = number - 1;
			while (counter > 1) {
				if (number % counter == 0) {
					System.out.println(counter);
				}
				counter--;
			}
		} else {
			System.out.println ("Enter a positive number less than 100");
		}
	}
}
		