// Utility class to perform basic length unit conversions
class UnitConverterLength {

	// Method to convert kilometers to miles
	public static double kmToMiles(double km) {
		return km * 0.621371;
	}

	// Method to convert miles to kilometers
	public static double milesToKm(double miles) {
		return miles * 1.60934;
	}

	// Method to convert meters to feet
	public static double metersToFeet(double meters) {
		return meters * 3.28084;
	}

	// Method to convert feet to meters
	public static double feetToMeters(double feet) {
		return feet * 0.3048;
	}
}
