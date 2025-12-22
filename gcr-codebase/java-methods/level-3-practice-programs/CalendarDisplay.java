import java.util.Scanner;
class CalendarDisplay {

	// Method to get month name
	public static String getMonthName (int month) {
		String[] months = {
			"", "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"
		};
		return months[month];
	}

	// Method to check leap year
	public static boolean isLeapYear (int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

	// Method to get days in month
	public static int getDaysInMonth (int month, int year) {
		int[] days = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
		if (month == 2 && isLeapYear(year)) return 29;
		return days[month];
	}

	// Method to get first day of month (0 = Sunday)
	public static int getFirstDay (int month, int year) {
		int d = 1;
		if (month < 3) {
			month += 12;
			year--;
		}
		int k = year % 100;
		int j = year / 100;
		return (d + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();

		System.out.println("\n" + getMonthName(month) + " " + year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		int firstDay = getFirstDay(month, year);
		int days = getDaysInMonth(month, year);

		for (int i = 0; i < firstDay; i++) System.out.print("    ");

		for (int day = 1; day <= days; day++) {
			System.out.printf("%3d ", day);
			if ((day + firstDay) % 7 == 0) System.out.println();
		}
	}
}
