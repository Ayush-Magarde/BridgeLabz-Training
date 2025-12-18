//Write a program to find the side of the square whose perimeter you read from the user 

import java.util.Scanner;
public class SideOfSquare{
	public static void main(String[] args){
		
		// Take perimeter as input from the user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Perimeter Of Square: ");
		double perimeterOfSquare = sc.nextDouble();
		//Perimeter of the Square is 4 times the side
		double sideOfSquare = perimeterOfSquare / 4;
		
		// Display the results
		System.out.println("The length of the side is: " + sideOfSquare +  " whose perimeter is: " + perimeterOfSquare);
	}
}