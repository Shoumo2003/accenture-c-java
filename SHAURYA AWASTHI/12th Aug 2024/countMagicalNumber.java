import java.util.Scanner;

public class countMagicalNumber {
    public static int solve(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int num = i, zero = 0;

            while (num != 0) {
                if (num % 2 == 0) zero++;
                num /= 2;
            }
            if (zero % 2 == 1) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
        sc.close();
    }
}
