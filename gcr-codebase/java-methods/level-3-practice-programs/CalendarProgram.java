import java.util.Scanner;
class CalendarProgram {

	// Method to check leap year
	public static boolean isLeapYear(int year) {
		if(year % 400 == 0) return true;
		if(year % 100 == 0) return false;
		return year % 4 == 0;
	}

	// Method to get number of days in month
	public static int getDaysInMonth(int month,int year) {
		if(month == 2) return isLeapYear(year) ? 29 : 28;
		if(month == 4 || month == 6 || month == 9 || month == 11) return 30;
		return 31;
	}

	// Method to find first day of month (Zeller’s Congruence)
	public static int firstDayOfMonth(int month,int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		return (1 + x + (31 * m) / 12) % 7;
	}

	// Method to display calendar
	public static void printCalendar(int month,int year) {
		String[] months = {"January","February","March","April","May","June","July",
						   "August","September","October","November","December"};

		System.out.println(months[month - 1] + " " + year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		int startDay = firstDayOfMonth(month,year);
		int days = getDaysInMonth(month,year);

		for(int i = 0; i < startDay; i++) {
			System.out.print("    ");
		}

		for(int day = 1; day <= days; day++) {
			System.out.printf("%3d ", day);
			if((day + startDay) % 7 == 0) System.out.println();
		}
	}

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Take input 
		System.out.print("Enter month: ");
		int month = input.nextInt();
		System.out.print("Enter year: ");
		int year = input.nextInt();
		// Display reuslts using the print method
		printCalendar(month,year);
	}
}
