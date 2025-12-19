/* Write a program to take user input for the age of all 10 students in a class and 
check whether the student can vote depending on his/her age is greater or equal to 18. */

import java.util.Scanner;
class StudentVoteEligilityChecker {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] age = new int[10];
		for (int i = 0; i < age.length; i++) {
			System.out.println("Please enter the age of the " + (i+1) + " student");
			age[i] = input.nextInt();
		}
		for (int i = 0; i < age.length; i++) {
			if (age[i] < 0) {
				System.out.println("Invalid age");
			} else if (age[i] > 18) {
				System.out.println ("This student with the age: " + age[i] + " can vote");
			} else {
				System.out.println ("This student with the age: " + age[i]+ " cannot vote");
			}
		}
	}
}