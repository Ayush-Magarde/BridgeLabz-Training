import java.util.Scanner;
class CalendarDisplay {

	// Method to check whether a year is a leap year
	public static boolean isLeap (int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

	// Method to find the first day of the given month and year
	public static int firstDay (int month, int year) {
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		return (1 + x + 31 * m0 / 12) % 7;
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take month and year as input
		System.out.print("Enter month and year: ");
		int m = input.nextInt();
		int y = input.nextInt();

		// Store month names and days
		String[] months = { "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec" };
		int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };

		// Adjust days for leap year
		if (m == 2 && isLeap(y)) days[1] = 29;

		// Display calendar formaat
		System.out.println(months[m - 1] + " " + y);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		// Find starting day and print calendar
		int start = firstDay(m, y);
		for (int i = 0; i < start; i++) System.out.print("    ");
		for (int d = 1; d <= days[m - 1]; d++) {
			System.out.printf("%3d ", d);
			if ((d + start) % 7 == 0) System.out.println();
		}
	}
}
