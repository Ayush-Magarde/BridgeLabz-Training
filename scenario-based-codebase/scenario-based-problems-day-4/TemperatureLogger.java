/* 11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks. */

import java.util.Scanner;
class TemperatureLogger {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] temperature = new double[7];
		double maxTemperature = -1; 
		int sum = 0;
		for (int i = 0; i < 7; i++) {
			System.out.println("Enter the temperature for " + (i+1) + " day: ");
			temperature[i] = input.nextDouble();
			if (temperature[i] > maxTemperature) {
				maxTemperature = temperature[i];
			}
			sum += temperature[i];
		}
		System.out.println ("Maximum temperature in last 7 days: " + maxTemperature);
		System.out.println ("Average temperature over last 7 days: " + (sum/7.0));
	}
}