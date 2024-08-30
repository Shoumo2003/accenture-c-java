import java.util.Scanner;

public class pythagoreanTheorem {
    public static int solve(int a, int b) {
        return (int) Math.ceil(Math.sqrt(a * a + b * b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(solve(a, b));
        }

        sc.close();
    }
}