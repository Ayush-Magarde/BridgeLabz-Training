import java.util.Scanner;

// Program to check whether a given year is a Leap Year
class LeapYearChecker {

	// Method to check leap year based on Gregorian calendar rules
	public static boolean isLeapYear(int year) {
		if (year < 1582) return false;
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();

		// Call method and display result
		System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
	}
}
