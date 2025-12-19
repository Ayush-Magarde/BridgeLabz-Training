// Write a program to create a calculator using switch...case.

import java.util.Scanner;

// Program to create calculator using switch-case
class CalculatorUsingSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		// Take inputs for the numbers and the operator
		System.out.print("Enter the First number: ");
        double first = input.nextDouble();
		System.out.print("Enter the Second number: ");
        double second = input.nextDouble();
		System.out.print("Enter the operator: ");
        String operator = input.next();

		// Apply switch case and do the required operation.
        switch (operator) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
