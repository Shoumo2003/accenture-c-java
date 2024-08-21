import java.util.*;

public class primeSum {
    public static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }    

    public static int solve(int n, int[] A) {
         int sum = 0;
         for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                sum += A[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(n, A));
        sc.close();
    }
}
