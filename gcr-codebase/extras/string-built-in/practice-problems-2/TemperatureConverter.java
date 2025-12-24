import java.util.Scanner;
class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit (double c) {
        return (c * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius (double f) {
        return (f - 32) * 5 / 9;
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = input.nextDouble();
        System.out.print("Convert to (C/F): ");
        char choice = input.next().charAt(0);
        if (choice == 'C') {
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        } else {
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        }
    }
}
