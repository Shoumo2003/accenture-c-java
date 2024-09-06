import java.util.Scanner;

public class maxDrop {
    public static int solve(int n, int[] arr) {
        int count = 0, maxCount = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }

        maxCount = Math.max(count, maxCount);
        return maxCount; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(n, arr));
        sc.close();
    }
}