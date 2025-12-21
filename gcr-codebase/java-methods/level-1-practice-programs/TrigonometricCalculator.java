import java.util.Scanner;
class TrigonometricCalculator {
	// Create a program to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[] {
                Math.sin(radians),
                Math.cos(radians),
                Math.tan(radians)
        };
    }
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();
		
		// Call the method 
        double[] values = calculateTrigonometricFunctions(angle);
		
		// Display the results
        System.out.println("Sine: " + values[0]);
        System.out.println("Cosine: " + values[1]);
        System.out.println("Tangent: " + values[2]);
    }
}
