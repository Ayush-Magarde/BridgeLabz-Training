import java.time.LocalDate;
import java.util.Scanner;
class DateComparison {

    // Method to compare two dates
    public static void compareDates (LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            System.out.println("First date is before second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after second date");
        } else {
            System.out.println("Both dates are equal");
        }
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(input.nextLine());
        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(input.nextLine());
        compareDates(date1, date2);
    }
}
