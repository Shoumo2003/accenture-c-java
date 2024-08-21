import java.util.Scanner;

public class googlyPrime {
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

    public static String solve(int N) {
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
             N /= 10;
        }
        if (isPrime(sum)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(solve(N));
        sc.close();
    }
}
