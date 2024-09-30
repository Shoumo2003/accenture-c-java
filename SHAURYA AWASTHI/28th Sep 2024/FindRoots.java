// Java program to find roots of a quadratic equation
import java.lang.Math;

public class FindRoots {
    // Prints roots of quadratic equation ax^2 + bx + c
    public static void findRoots(int a, int b, int c) {
        // If a is 0, then equation is not quadratic, but linear
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }

        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));

        if (d > 0) {
            System.out.println("Roots are real and different");
            System.out.println((-b + sqrt_val) / (2 * a));
            System.out.println((-b - sqrt_val) / (2 * a));
        } else if (d == 0) {
            System.out.println("Roots are real and same");
            System.out.println(-(double)b / (2 * a));
        } else { // d < 0
            System.out.println("Roots are complex");
            System.out.println(-(double)b / (2 * a) + " + i" + sqrt_val / (2 * a));
            System.out.println(-(double)b / (2 * a) + " - i" + sqrt_val / (2 * a));
        }
    }

    // Driver code
    public static void main(String[] args) {
        int a = 1, b = -7, c = 12;

        // Function call
        findRoots(a, b, c);
    }
}

