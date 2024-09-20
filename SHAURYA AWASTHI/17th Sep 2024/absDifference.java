import java.util.Scanner;

public class absDifference {
    public static int solve(int n, int[] arr, int k) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            if (i < k) sum1 += arr[i];
            if (n - i - 1 > k) sum2 += arr[n - i - 1];
        }
        System.out.println(sum1 + " " + sum2);

        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.println(solve(n, arr, k));
        scanner.close();
    }
}