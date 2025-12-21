import java.util.Scanner;
class SmallestAndLargestNumber {
	public static int [] findSmallestAndLargest (int number1, int number2, int number3) {
		// Initializing smallest and largest with number1 for comparision
		int smallest = number1;
		int largest = number1;
		// Finding the smallest number
		if (number2 < smallest) smallest = number2;
		if (number3 < smallest) smallest = number3;
		// Finding the largest number
		if (number2 > largest) largest = number2;
		if (number3 > largest) largest = number3;
		
		return new int [] {smallest, largest};
	}
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int number1 = input.nextInt();
		System.out.print("Please enter the second number: ");
		int number2 = input.nextInt();
		System.out.print("Please enter the third number: ");
		int number3 = input.nextInt();
		
		// Invoke the method to find the smallest and largest number
		int [] smallestLargest = findSmallestAndLargest(number1, number2, number3);
		
		// Display the results
		System.out.println("the smallest number: " + smallestLargest[0]);
		System.out.println("the largest number: " + smallestLargest[1]);
	}
}