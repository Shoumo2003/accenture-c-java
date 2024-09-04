import java.util.Scanner;

public class arrayIndexOperations {
    public static int solve(int n, int[] arr) {
        if (n == 0) return 0;
        if (n == 1) return arr[0];

        int xorr = arr[1];
        int sum = arr[0];

        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) sum += arr[i];
            else xorr = xorr ^ arr[i];
        }

        return sum + xorr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.println(solve(n, arr));
        scanner.close();
    }
}

