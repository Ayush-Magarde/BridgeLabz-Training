/*Write a program to input the unit price of an item and the quantity to be bought.
 Then, calculate the total price*/

import java.util.Scanner;
public class TotalPriceCalculation{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		// Take unit price and quantity of the item as input from the user
		System.out.println("Enter the unitPrice of the Item: ");
		double unitPrice = sc.nextDouble();
		System.out.println("Enter the Quantity to be bought: ");
		int quantity = sc.nextInt();
		// Calculating total price
		Double totalPrice = unitPrice * quantity;
		
		// Displaying the results
		System.out.println("The total purchase price is INR: "+ totalPrice +" if the quantity: " + quantity + " and unit price is INR: " + unitPrice );
	}
}	