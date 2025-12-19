/* Create a program to find the multiplication table of a 
number entered by the user from 6 to 9 and display the result. */
import java.util.Scanner;
class MultiplicationResult {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take user input and initialize an array of size 4 (6,7,8,9)
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int[] multiplicationResult = new int [4];
		int index = 0; 
		// Run a for loop to find the multiples of the number
		for (int i = 6; i <= 9; i++) {
			multiplicationResult[index] = number * i;
			index++;
		}
		index = 0;
		// Print the array
		for (int i = 6; i <= 9; i++) {
			System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
			index++;
		}
	}
}
			
		