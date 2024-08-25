import java.util.Scanner;

public class countSecondLargestElement {
    public static int solve(int[] arr, int n) {
        int count = 0, idx = n - 1;

        while (idx >= 0 && arr[idx] == arr[n - 1]) idx--;

        if (idx < 0) return 0;
        else {
            int temp = arr[idx];
            while (idx >= 0 && arr[idx] == temp) {
                count++;
                idx--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(arr, n));
        sc.close();
    }
}
