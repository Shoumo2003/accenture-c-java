import java.util.Scanner;

public class nthFibonacciNumber {
    public static int solve(int n) {
        if (n == 0 || n == 1) return n;
        int prev1 = 1, prev2 = 0;

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solve(n));
        sc.close();
    }
}