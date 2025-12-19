/* Rewrite program 1 to determine Leap Year with single 
if condition using logical and && and or || operators. */

import java.util.Scanner;
class LeapYearLogical {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		// Take year in input
		System.out.print ("Enter the year: ");
        int year = input.nextInt();
		// Enter all the logical contraints inside a single if statement
        if ((year >= 1582) && (year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
