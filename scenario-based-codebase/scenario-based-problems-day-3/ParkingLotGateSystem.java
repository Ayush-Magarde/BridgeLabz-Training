import java.util.Scanner;
class ParkingLotGateSystem {
	public static void main (String[] args) {
		// lets say there are 5 parking spots in a parking lot
		// and initially all of them are empty
		// lets ask the user, what they want
		Scanner input = new Scanner(System.in);
		int availableSpots = 5;
		System.out.println("This parking lot has 5 parking spots\n");
		while (true) {
			System.out.println("Options:\nPark	Exit	Show Occupancy");
			String option = input.nextLine().toLowerCase();
			switch (option) {
				case "park" : {
					if (availableSpots == 0) {
						System.out.println("Sorry the parking lot is full...");
					}
					else {
						availableSpots--;
						System.out.println("Vehicle parked");
						System.out.println("Available parking spots: " + availableSpots);
					}
					break;
				}
				case "exit" : {
					if (availableSpots == 5) {
						System.out.println("The parking lot is already empty\nEXITING SYSTEM");
					}
					else {
						availableSpots++;
						System.out.println("Vehicle Exited\nEXITING SYSTEM");
					}
					return;
				}
				case "show occupancy" : {
					System.out.println("Available parking spots: " + availableSpots);
					break;
				}
				default : System.out.println("Invalid input!!!");
			}
			if (availableSpots == 0) {
				System.out.println("SORRY NO MORE SPOTS LEFT...\nEXITING SYSTEM");
				break;
			}
		}
	}
}