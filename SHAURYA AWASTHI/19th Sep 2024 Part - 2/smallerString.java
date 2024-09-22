import java.util.Scanner;

public class smallerString {
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
        String s1 = scanner.next();
        String s2 = scanner.next();

        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            char c1 = Character.toLowerCase(s1.charAt(i));
            char c2 = Character.toLowerCase(s2.charAt(j));
            if (c1 > c2) {
                System.out.print(1);
                return;
            } else if (c1 < c2) {
                System.out.print(-1);
                return;
            }

            i++;
            j++;
        }

        scanner.close();
    }
}

