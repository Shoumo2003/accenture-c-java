import java.util.Scanner;

public class hourFormatChange {

    // Function to convert 24-hour format to 12-hour format
    public static void convertTo12Hour(int hour, int minute) {
        String period;

        // Determine if it's AM or PM
        if (hour >= 12) {
            period = "PM";
            if (hour > 12) // Convert to 12-hour format
                hour -= 12;
        } else {
            period = "AM";
            if (hour == 0) // Handle midnight case (00:00)
                hour = 12;
        }

        // Print in 12-hour format with leading zeros for minutes
        System.out.printf("12-hour format: %02d:%02d %s%n", hour, minute, period);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour, minute;

        // Input: 24-hour format
        System.out.print("Enter hour (0-23): ");
        hour = scanner.nextInt();
        System.out.print("Enter minute (0-59): ");
        minute = scanner.nextInt();

        // Validate inputs
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.out.println("Invalid time input!");
            return;
        }

        // Convert to 12-hour format and print the result
        convertTo12Hour(hour, minute);
    }
}

