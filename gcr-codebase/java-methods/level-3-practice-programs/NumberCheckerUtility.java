import java.util.Scanner;
class NumberCheckerUtility {
	
	// Method to Find the count of digits in the number
	public static int digitsCounter (int number) {
		if (number == 0) return 1;
		int count = 0;
		while (number != 0) {
			count ++;
			number /= 10;
		}
		return count;
	}
	
	// Method to Store the digits of the number in a digits array
	public static int[] storeDigits (int number, int count) {
		int [] digitsArray = new int [count];
		int index = count - 1;
		while (number != 0) {
			digitsArray[index--] = number % 10;
			number /= 10;
		}
		return digitsArray;
	}
	
	// Method to Check if a number is a duck number using the digits array
	public static boolean duckNumberChecker (int[] digitsArray) {
		if (digitsArray[0] == 0) return false;
		for (int value : digitsArray) {
			if (value == 0) return true;
		}
		return false;
	}
	// Method to check if the number is a armstrong number using the digits array
	public static boolean armstrongNumberChecker (int[] digitsArray, int number) {
		int digitSquareSum = 0;
		for (int value : digitsArray) {
			digitSquareSum += (int) Math.pow(value, digitsArray.length);
		}
		if (number == digitSquareSum) return true;
		return false;
	}
	// Method to find the largest and second largest elements in the digits array
	public static int[] largestAndSecondLargest (int[] digitsArray) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int value : digitsArray) {
			if (value > largest) {
				secondLargest = largest;
				largest = value;			
			} else if (value > secondLargest && value != largest) {
				secondLargest = value;
			}
		}
		return new int[] {largest, secondLargest};
	}
	// Method to find the the smallest and second smallest elements in the digits array
	public static int[] smallestAndSecondSmallest(int[] digitsArray) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int value : digitsArray) {
			if (value < smallest) {
				secondSmallest = smallest;
				smallest = value;
			} 
			else if (value < secondSmallest && value != smallest) {
				secondSmallest = value;
			}
		}
		return new int[] {smallest, secondSmallest };
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print ("Please enter a number: ");
		int number = input.nextInt();
		
		// Call the methods
		int count = digitsCounter (number);
		int[] digitsArray = storeDigits(number, count);
		boolean isDuckNumber = duckNumberChecker(digitsArray);
		boolean isArmstrongNumber = armstrongNumberChecker(digitsArray, number);
		int[] largest = largestAndSecondLargest(digitsArray);
		int [] smallest = smallestAndSecondSmallest(digitsArray);
		
		// Display the results
		System.out.println("Number of digits: " + count);
		for (int value : digitsArray) {
			System.out.print(value + " ");
		} System.out.println();
		System.out.println ("Is it a duck number: " + isDuckNumber);
		System.out.println ("Is it an armstrong number: " + isArmstrongNumber);
		System.out.println ("largest: " + largest[0] + " second largest: " + largest[1]);
		System.out.println ("smallest: " + smallest[0] + " second smallest: " + smallest[1]);
	}
}