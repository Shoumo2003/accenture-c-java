import java.util.Scanner;

public class evenOdd {
    public static int pro(int n) {
        int pro = 1;

        while (n > 0) {
            pro *= (n % 10);
            n /= 10;
        }

        return pro;
    }

    public static int sum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }

    public static int solve(int n) {
        if (n % 2 == 0) return sum(n);
        else return pro(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solve(n));
        sc.close();
    }
}
