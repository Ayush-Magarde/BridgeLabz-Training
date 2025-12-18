// Find the sum until the user enters 0 or a negative number using while loop and break statement

import java.util.Scanner;
class SumUntilZeroWithBreak {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		while (true) {
			System.out.println("Keep entering values: ");
			double value = input.nextDouble();
			if (value <=0) {
			break;
			}
			total += value;
		}
		System.out.println("Total sum: " + total);
	}
}
		