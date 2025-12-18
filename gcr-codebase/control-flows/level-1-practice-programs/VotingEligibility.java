/* Write a program to check whether a person can vote, 
depending on whether his/her age is greater than or equal to 18. */

import java.util.Scanner;
class VotingEligibility {
	public static void main (String[] args) {
		// Take user's age in input
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = input.nextInt();
		// Check if they are eligible to vote
		if (age >= 18) {
			System.out.println("The person's age is " + age + " and can vote");
		} else {
			System.out.println("The person's age is " + age + " and cannot vote");
		}
	}
}