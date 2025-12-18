// Write a program to check for the natural number and write the sum of n natural numbers. 

import java.util.Scanner;
class SumOfNaturalNumbers {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
		// Take a number as an input from the user
		System.out.print ("Please enter a number: ");
        int number = input.nextInt();
        if (number >= 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        input.close();
    }
}
