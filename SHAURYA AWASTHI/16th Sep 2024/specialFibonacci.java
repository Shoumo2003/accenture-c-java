import java.util.Scanner;

public class specialFibonacci {
    public static int fib(int n) {
        int a = 1, b = 1, c;
        if (n == 0 || n == 1)
            return 1;
        for (int i = 2; i <= n; i++) {
            c = (a * a + b * b) % 47;
            a = b;
            b = c;
        }
        return b % 47;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
        scanner.close();
    }
}

