// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.Scanner;
class SimpleInterestCalculator {
	public static double calculateSimpleInterest (double principal, double rate, double time) {
		return ((principal * rate * time)/ 100);
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter principal: ");
		double principal = input.nextDouble();
		System.out.print("Enter rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter time: ");
		double time = input.nextDouble();
		
		// Call the method
		double simpleInterest = calculateSimpleInterest(principal,rate,time);
		
		// Display the result
		System.out.print("Simple Interest: " + simpleInterest);
	}
}
