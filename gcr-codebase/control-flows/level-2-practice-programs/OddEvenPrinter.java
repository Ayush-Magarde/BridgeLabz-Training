//Create a program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;
class OddEvenPrinter {
    public static void main(String[] args) {
		
		// Take a number till which you want to print
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();
		// Check if it is a natural number
        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
				// When divided by two, if the remainder is zero: Even
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
