import java.util.Scanner;

public class checkPrime {
    public static boolean isPrime(int N) {
        if (N <= 1) return false;

        for (int i = 0; i < Math.sqrt(N); i++) {
            if (N % 2 == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (isPrime(N)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}