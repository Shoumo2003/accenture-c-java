import java.util.Scanner;

public class sumOfPositiveNumber {
   public static int solve (int[] arr, int n ) {
        int size = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                size++;
            }
        }

        int mid = (size - 1) / 2;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                if (mid == 0) return arr[i];
                mid--;
            }
        }

        return -1;
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
