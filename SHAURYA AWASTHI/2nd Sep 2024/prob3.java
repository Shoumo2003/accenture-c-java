import java.util.Scanner;

public class prob3 {
    public static int solve(int n, int[] arr) {
        int sum = 0;
        
        for (int idx = 0; idx < n; idx++) {
            int Ridx = n - idx - 1;
            if (Ridx % 2 == 0) sum += arr[idx];
        }
        return sum;
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println(solve(n, arr));
        scanner.close();
    }
}

