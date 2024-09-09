import java.util.Arrays;
import java.util.Scanner;

public class totalCount {
    public static void solve(int n, int[] arr, int target) {
        int[] ans = new int[2];
        int prod = 0;

        Arrays.sort(arr);
        int st = 0, end = n - 1;
        while (st < end) {
            int sum = arr[st] + arr[end];

            if (sum == target) {
                if (prod < arr[st] * arr[end]) {
                    prod = arr[st] * arr[end];
                    ans[0] = arr[st];
                    ans[1] = arr[end];
                }
                st++;
                end--;
            } else if (sum < target) {
                end--;
            } else {
                st++;
            }
        }
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        solve(n, arr, target);
        scanner.close();
    }
}

