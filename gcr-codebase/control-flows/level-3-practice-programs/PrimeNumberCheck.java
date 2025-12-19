// Write a Program to check if the given number is a prime number or not

import java.util.Scanner;
class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		// Take a number in input
		System.out.print ("Enter a number: ");
        int number = input.nextInt();
		// Initialize a boolean flag
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
				// If i completely divides the number, then it is not prime
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
		
		// Display the result
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
