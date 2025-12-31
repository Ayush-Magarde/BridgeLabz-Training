/* 14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop. */

import java.util.*;
class MovieTicketBookingApp {
	
	static int totalBill = 0;
	static Scanner input = new Scanner (System.in);
	
	public static String returnMovieType () {
		
		while (true) {
			String movieType = input.nextLine().toLowerCase();
			switch (movieType) {
				case "action" -> {
					System.out.println("\nACTION MOVIE... sounds fun!\n");
					return movieType;
				}
				case "comedy" -> {
					System.out.println("\nCOMEDY MOVIE... sounds fun!\n");
					return movieType;
				}
				case "romance" -> {
					System.out.println("\nROMANCE MOVIE... sounds fun!\n");
					return movieType;
				}
				default -> {
					System.out.println("\nPlease enter a valid movie type...\n");
				}
			}
		}
	}
	
		public static String returnSeatType () {
			
			while (true) {
				String seatType = input.nextLine().toLowerCase();
				switch (seatType) {
					case "platinum" -> {
						System.out.println("\nPLATINUM TICKET BOOKED\n");
						totalBill += 400;
						return seatType;
					}
					case "gold" -> {
						System.out.println("\nGOLD TICKET BOOKED\n");
						totalBill += 250;
						return seatType;
					}
					case "silver" -> {
						System.out.println("\nSILVER TICKET BOOKED\n");
						totalBill += 200;
						return seatType;
					}
					default -> {
						System.out.println("\nPlease enter a valid seat type...\n");
					}
				}
			}
		}
		
	public static String returnSnackChoice () {
		
		while (true) {
			String snackChoice = input.nextLine().toLowerCase();
			switch (snackChoice) {
				case "yes" -> {
					System.out.println("\nSnacks added... Yum!\n");
					totalBill += 50;
					return snackChoice;
				}
				case "no" -> {
					System.out.println("\nEnjoy your movie!\n");
					return snackChoice;
				}
				default -> {
					System.out.println("\nPlease enter a valid answer...\n");
				}
			}
		}
	}
	
	public static String returnBookAgain () {
		
		while (true) {
			totalBill = 0;
			String bookAgain = input.nextLine().toLowerCase();
			switch (bookAgain) {
				case "yes" -> {
					return bookAgain;
				}
				case "no" -> {
					System.out.println("\nEXITING SYSTEM...\n");
					return bookAgain;
				}
				default -> {
					System.out.println("\nPlease enter a valid answer...\n");
				}
			}
		}
	}
	
	public static void main (String[] args) {
		
		while (true) {
			System.out.println("\n--------------Which movie do you want to watch ?--------------\n");
			System.out.println("|ACTION|		|COMEDY|		|ROMANCE|");
			String movieType = returnMovieType();
			System.out.println("\n--------------Which seats do you want ?--------------\n");
			System.out.println("|PLATINUM| -> 400 rs	\n|GOLD| -> 250 rs		\n|SILVER| -> 200 rs");
			String seatType = returnSeatType();
			System.out.println("\n--------------Do you want snacks for just 50 rs ?--------------\n");
			System.out.println ("|YES|		|NO|");
			String snackChoice = returnSnackChoice();
			System.out.println("\n--------------Ticket Booked--------------\n");
			System.out.println("\nTotal bill: " + totalBill +  "\n"); 
			System.out.println("\n--------------Do you want to book again ?--------------\n");
			System.out.println ("\n|YES|		|NO|\n");
			String bookAgain = returnBookAgain();
			if(bookAgain.equals("no")) break;
		}
	}
}