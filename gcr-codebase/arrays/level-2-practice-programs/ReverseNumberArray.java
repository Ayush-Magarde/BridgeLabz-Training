import java.util.Scanner;
class ReverseNumberArray {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int temp = number;
		int digitCount = 0;
		while (temp != 0) {
			digitCount++;
			temp /= 10;
		}
		int[] digitsArray = new int[digitCount];
		// Fill the array from the last digit to first
		for (int i = 0; i < digitCount; i++) {
			digitsArray[i] = number % 10;
			number /= 10;
		}
		// Display the reversed number
		for (int i = 0; i < digitCount; i++) {
			System.out.print (digitsArray[i] + " ");
		}
	}
}