/* 19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation. */

import java.util.Scanner;
class BusRouteDistanceTracker {
	public static void main (String[] args) {
		// lets say there are 5 stops
		// Distance till 1st stop -> 10 km
		// Distance till 2nd stop -> 15 km (stop 1 to stop 2)
		// Distance till 3rd stop -> 12 km (stop 2 to stop 3)
		// Distance till 4th stop -> 18 km (stop 3 to stop 4)
		// Distance till 5th stop -> 11 km (stop 4 to stop 5)
		Scanner input = new Scanner(System.in);
		int[] distancesToStops = {0,10,15,12,18,11};
		int totalDistance = 0;
		int stop = 1;
		System.out.println("You are on the bus...");
		while (true) {
			System.out.println("Do you want to get off at stop" + stop + "? yes/no");
			String getOff = input.nextLine().toLowerCase();
			totalDistance += distancesToStops[stop++];
			if (getOff.equals("yes")) {
				System.out.println("You have travelled: " + totalDistance + " Kms");
			}
			else if (getOff.equals("no")) {
				System.out.println("Bus going to stop " + stop);
			}
			else if (stop == 5) {
				System.out.println("Please get off this is the last stop");
				break;
			}
		}
		System.out.println("Journey ended...");
	}
}