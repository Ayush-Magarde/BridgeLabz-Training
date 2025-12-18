/* Write a program SpringSeason that takes two int values month and day from the 
command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. */

import java.util.Scanner;
class SpringSeasonCheck {
	public static void main (String[] args) {
		// Take input for month and days
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter a valid month between 1-12: "); 
		int month = input.nextInt();
		System.out.print ("Enter a valid day between 1-30: "); 
		int day = input.nextInt();
		// If else statements for checking whether its spring season or not
		if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <=20)) {
			System.out.println("Its a Spring Season");
		} else {
			System.out.println("Not a Spring Season");
		}
	}
}
