import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class DateFormatting {

    // Method to display date in different formats
    public static void displayFormattedDates () {
        LocalDate today = LocalDate.now();
        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(today.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")));
    }

    // Main method
    public static void main (String[] args) {
        displayFormattedDates();
    }
}
