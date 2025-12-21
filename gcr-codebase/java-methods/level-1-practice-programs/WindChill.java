import java.util.Scanner;
class  WindChill {
	// Create a method to calculate wind chill 
	public double calculateWindChill (double temperature, double windSpeed) {
		double winnChill = 35.74 + 0.6225 * temperature + (0.4275 * temperature - 35.75) * Math.pow (windSpeed, 0.16);
		return winnChill;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter temperature: ");
		double temperature = input.nextDouble();
		System.out.print("Enter wind speed: ");
		double windSpeed = input.nextDouble();
		
		// Create an object to call the non-static method
		WindChill wc = new WindChill();
		
		// Calling the method
		double result = wc.calculateWindChill(temperature, windSpeed);
		
		//Display the result
		System.out.println ("The Wind chill temperature is: " + result);		
	}
}