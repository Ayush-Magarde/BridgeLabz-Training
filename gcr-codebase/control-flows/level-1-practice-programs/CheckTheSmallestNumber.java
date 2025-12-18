// Write a program to check if the first is the smallest of the 3 numbers.
import java.util.Scanner;
class CheckTheSmallestNumber {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take three numbers from the user
		System.out.print("Enter the first Number: ");
		int number1 = input.nextInt();
		System.out.print("Enter the Second Number: ");
		int number2 = input.nextInt();
		System.out.print("Enter the Third Number: ");
		int number3 = input.nextInt();
		// Check if the first number is the smallest
		if (number1 < number2) {
			if (number1 < number3) {
				System.out.println("Is the first number the smallest? Yes");
			}
			else {
				System.out.println("Is the first number the smallest? No");
			}
		}
		else {
			System.out.println("Is the first number the smallest? No");
		}
	}
}