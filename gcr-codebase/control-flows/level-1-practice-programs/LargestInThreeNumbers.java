// Write a program to check if the first, second, or third number is the largest of the three.
import java.util.Scanner;
class LargestInThreeNumbers {
    public static void main(String[] args) {
		
		// Take three numbers in input
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
		// Check which numnber is the largest using if else conditions
		if (number1 >= number2 && number1 >= number3) {
		System.out.println("Is the first number the largest? YES");
		} else if (number2 >= number1 && number2 >= number3) {
		System.out.println("Is the second number the largest? YES");
		} else {
		System.out.println("Is the third number the largest? YES");
		}		
		/* If all three numbers are equal, then it will return the 
		first number as the largest. */
    }
}