// Create a program to convert the distance of 10.8 kilometers to miles.

// Create a class KilometersToMiles to convert the distance in kilometers  to miles.
public class KilometersToMiles {
	public static void main (String[] args) {
	
		// Create a double variable an assigning the value of distance in kilometers.
		double distanceInKilometers = 10.8;
		
		// Create a double variable to convert kilometers distance into miles.
		double distanceInMiles = distanceInKilometers * 1.6;
		
		// Display the kilometers distance into miles.
		System.out.println ("The distance " + distanceInKilometers + "km in miles is: " + distanceInMiles);
	}
}