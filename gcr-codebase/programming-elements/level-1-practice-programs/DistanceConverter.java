//Create a program to convert distance in kilometers to miles.

import java.util.Scanner;
public class DistanceConverter {
	public static void main(String[] args){
		
		// Create varibles to store distance in Kilometers.
		Scanner input = new Scanner(System.in);
		System.out.print("enter the value of distance in kilometers: ");
		double km = input.nextDouble();
		// Convert kilometers to miles.
		double miles = km * (1/1.6);
		
		// Display the distance in miles.
		System.out.println(miles);
	}
}