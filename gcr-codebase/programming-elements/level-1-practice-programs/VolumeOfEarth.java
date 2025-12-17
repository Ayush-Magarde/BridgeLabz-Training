// Write a Program to compute the volume of Earth in km^3 and miles^3
public class VolumeOfEarth {
    public static void main(String[] args) {
		// Create variables for radii in kilometers and miles
        double radiusInKilometers = 6378;
        double radiusInMiles = radiusInKilometers * 0.62;
		// Calculate volunme in km^3 and mile^3
        double volumeInKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusInKilometers, 3);
        double volumeInMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);

		// Display the volumes.
        System.out.println("The volume of earth in cubic kilometers is: " + volumeInKm3 + 
		" and cubic miles is: " + volumeInMiles3);
    }
}