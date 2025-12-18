// Write a program to check if a number is divisible by 5
import java.util.Scanner;
class DivisibleBy5 {
	public static void main (String[] args) {
		// Take a number from the user
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the number: ");
		int dividend = input.nextInt();
		// If: to check if the remainder is zero, its divisible by 5.
		if (dividend%5 == 0) {
			System.out.println ("Is the number " + dividend + " divisible by 5?" + " Yes");
		}
		// Else: if the remainder is non-zero, its not divisible by 5.
		else {
			System.out.println ("Is the number " + dividend + " divisible by 5?" + " No");
		}
		input.close();
	}
}
	