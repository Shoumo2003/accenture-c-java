import java.util.Scanner;

public class NoOfRotations {
    // Function to calculate the number of rotations
    public static double calculateRotations(double x_init, double y_init, double x_final, double y_final, double radius) {
        // Calculate the Euclidean distance between the initial and final centers
        double distance = Math.sqrt((x_final - x_init) * (x_final - x_init) + (y_final - y_init) * (y_final - y_init));
        
        // Calculate the circumference of the circle (2 * pi * radius)
        double circumference = 2 * Math.PI * radius;
        
        // Calculate the number of rotations
        double rotations = distance / circumference;
        
        return rotations;
    }

    public static void main(String[] args) {
        // Example usage
        Scanner scanner = new Scanner(System.in);
        
        double x_init;
        double y_init;
        double x_final;
        double y_final;
        double radius;  // Example radius

        x_init = scanner.nextDouble();
        y_init = scanner.nextDouble();
        x_final = scanner.nextDouble();
        y_final = scanner.nextDouble();
        radius = scanner.nextDouble();
        
        double rotations = calculateRotations(x_init, y_init, x_final, y_final, radius);
        System.out.println("Number of rotations: " + rotations);
        
        scanner.close();
    }
}

