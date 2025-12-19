// Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 

import java.util.Scanner;
class LeapYearChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Take year input
		System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Leap year works only for Gregorian calendar
        if (year < 1582) {
            System.out.println("Year must be 1582 or later");
            input.close();
            return;
        }
        // If-else conditions to check if its a leap year
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
