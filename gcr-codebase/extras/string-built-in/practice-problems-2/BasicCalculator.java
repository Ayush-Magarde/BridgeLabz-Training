import java.util.Scanner;
class BasicCalculator {

    // Addition
    public static int add (int a, int b) {
        return a + b;
    }
    // Subtraction
    public static int subtract (int a, int b) {
        return a - b;
    }
    // Multiplication
    public static int multiply (int a, int b) {
        return a * b;
    }
    // Division
    public static int divide (int a, int b) {
        return a / b;
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("Choose operation (+ - * /): ");
        char op = input.next().charAt(0);
        if (op == '+') System.out.println("Result: " + add(a, b));
        else if (op == '-') System.out.println("Result: " + subtract(a, b));
        else if (op == '*') System.out.println("Result: " + multiply(a, b));
        else if (op == '/') System.out.println("Result: " + divide(a, b));
    }
}
