import java.time.ZonedDateTime;
import java.time.ZoneId;
class TimeZones {

    // Method to display current time in different time zones
    public static void displayTimeZones () {
        System.out.println("GMT Time: " + ZonedDateTime.now(ZoneId.of("GMT")));
        System.out.println("IST Time: " + ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println("PST Time: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
    }

    // Main method
    public static void main (String[] args) {
        displayTimeZones();
    }
}
