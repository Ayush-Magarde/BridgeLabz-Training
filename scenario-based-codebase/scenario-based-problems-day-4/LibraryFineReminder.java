/* 15. Rohan’s Library Reminder App 
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop. */

//Import LocalDate and temporal.ChronoUnit
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryFineReminder {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int  totalBooks = 5;
		int finePerDay = 5;
		
		for (int i = 1; i <= totalBooks; i++) {
			System.out.println("-----------Book " + (i) + "-----------\n");
			System.out.println("Date format -> (yyyy-mm-dd)");
			
			System.out.print("Enter the Due Date:\t");
			// Use LocalDate to take date input
			LocalDate dueDate = LocalDate.parse(input.next());
			System.out.print("Enter the Return Date:\t");
			LocalDate returnDate = LocalDate.parse(input.next());
			
			// Calculate fine 
			if (returnDate.isAfter(dueDate)) {
				// Use ChronoUnit to calculate the days in between
				long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);
				long fine = lateDays*finePerDay;
				System.out.println("\nLate by: " + lateDays + " days\n");
				System.out.println("\nFine : " + fine + "\n");				
			}
			else {
				System.out.println("\nReturned on time, No fine\n");
			}
		}
		System.out.println("\nTHANK YOU\n");
	}
}