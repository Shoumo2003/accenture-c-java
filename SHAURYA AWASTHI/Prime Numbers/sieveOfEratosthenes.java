import java.util.Scanner; 

public class sieveOfEratosthenes {
    public static void sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }
        primes[0] = primes[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i+= p) {
                    primes[i] = false;
                }
            }
        }

        for (int p = 2; p <= n; p++) {
            if (primes[p]) {
                System.out.println(p + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sieveOfEratosthenes(n);
        sc.close();
    }
}
