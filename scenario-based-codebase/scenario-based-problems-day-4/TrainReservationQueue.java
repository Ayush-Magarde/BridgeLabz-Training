/* 12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break). */

import java.util.Scanner;
class TrainReservationQueue {
	public static void main (String[] args) {
		// lets say we the train has 10 seats
		// initially all the seats are empty
		Scanner input = new Scanner(System.in);
		int numberOfSeats = 10;
		while (true) {
			System.out.println("Choose:\n");
			System.out.println("Book | Available Seats | Exit\n");
			String option = input.nextLine().toLowerCase();
			switch (option) {
                case "book" -> {
                    System.out.println("Available seats: " + numberOfSeats);
                    System.out.print("How many seats do you wish to book: ");

                    int bookTickets = input.nextInt();
                    input.nextLine(); // consume newline

                    if (bookTickets <= 0 || bookTickets > numberOfSeats) {
                        System.out.println("Invalid input");
                    } else {
                        numberOfSeats -= bookTickets;
                        System.out.println(bookTickets + " seats booked!!");
                    }
                }
				case "available seats" -> {
					System.out.println("Available seats: " + numberOfSeats + "\n");
				}
				case "exit" -> {
					System.out.println("System Exited!\n");
				}
				default -> System.out.println("Invalid input\n");
			}
			if (option.equals("exit")) break;
			if (numberOfSeats == 0) {
				System.out.println("NO MORE TICKETS LEFT....SYSTEM EXITING\n");
				break;
			}
		}
	}
}
