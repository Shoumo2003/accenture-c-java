import java.util.Scanner;

public class nextPrime {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Function to find the next prime number after n
    public static int NextPrime(int n) {
        int candidate = n + 1;
        while (true) {
            if (isPrime(candidate))
                return candidate;
            candidate++;
        }
    }

    // Function to check if the second number is the next prime after the first
    public static boolean isNextPrime(int prime1, int prime2) {
        if (!isPrime(prime1) || !isPrime(prime2))
            return false;
        return NextPrime(prime1) == prime2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (isNextPrime(num1, num2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }
}

