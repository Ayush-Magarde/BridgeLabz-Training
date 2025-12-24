import java.util.Scanner;
class MaximumOfThree {

    // Method to find maximum of three numbers
    public static int findMaximum (int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int result = findMaximum(a, b, c);
        System.out.println("Maximum number: " + result);
    }
}
