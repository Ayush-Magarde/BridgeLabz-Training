import java.util.Scanner;
class SpringSeasonCheck {
	// Create a method to check if it's spring season or not
	public static boolean springSeasonChecker (int month, int day ) {
		// spring season from march 20 to june 20
		if ((month == 3 && day >= 20) || (month == 4 || month == 5) || (month == 6 && day <= 20)) return true;
		return false;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the month: ");
		int month = input.nextInt();
		System.out.print("Please enter the day: ");
		int day = input.nextInt();
		
		// Call the method
		boolean springCheck = springSeasonChecker(month,day);
		if (springCheck) System.out.print("It is Spring Season.");
		else System.out.print("It is not Spring Season.");
	}
}