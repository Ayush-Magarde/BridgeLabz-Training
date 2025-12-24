import java.util.Scanner;
class GcdLcm {

    // Method to calculate GCD
    public static int calculateGCD (int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int calculateLCM (int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("GCD: " + calculateGCD(a, b));
        System.out.println("LCM: " + calculateLCM(a, b));
    }
}
