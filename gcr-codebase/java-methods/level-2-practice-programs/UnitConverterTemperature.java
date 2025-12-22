class UnitConverterTemperature {

	// Method to convert Fahrenheit to Celsius
	public static double fahrenheitToCelsius(double f) {
		return (f - 32) * 5 / 9;
	}

	// Method to convert Celsius to Fahrenheit
	public static double celsiusToFahrenheit(double c) {
		return (c * 9 / 5) + 32;
	}

	// Method to convert pounds to kilograms
	public static double poundsToKg(double pounds) {
		return pounds * 0.453592;
	}

	// Method to convert kilograms to pounds
	public static double kgToPounds(double kg) {
		return kg * 2.20462;
	}

	// Method to convert gallons to liters
	public static double gallonsToLiters(double gallons) {
		return gallons * 3.78541;
	}

	// Method to convert liters to gallons
	public static double litersToGallons(double liters) {
		return liters * 0.264172;
	}
}
