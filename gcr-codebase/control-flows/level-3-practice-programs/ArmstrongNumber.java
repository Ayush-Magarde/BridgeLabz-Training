/* Create a program to check if a number is armstrong or not. 
Use the hints to show the steps clearly in the code. */

import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		System.out.print ("Enter a number: ");
        int number = input.nextInt();
		// Initialize originalNumber and assign the value of number to it.
        int originalNumber = number;
		// Initialize sum with zero to add the cube of all digits of the number.
        int sum = 0;
		
		// While loop until the originalNumber becomes zero
        while (originalNumber != 0) {
			// Modulo operator to give the last digit of the number
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
			// Int Division to remove the last digit
            originalNumber /= 10;
        }

        if (sum == number) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
