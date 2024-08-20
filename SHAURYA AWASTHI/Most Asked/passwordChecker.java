import java.util.Scanner;

public class passwordChecker {
    public static int checkPassword (char[] str, int n) {
        if (n < 4) return 0;

        if (Character.isDigit(str[0])) return 0;

        int a = 0, cap = 0, nu = 0;
        for (int i = 0; i < n; i++) {
            if (str[i] == ' ' || str[i] == '/') return 0;

            if (Character.isUpperCase(str[i])) cap++;

            else if (Character.isDigit(str[i])) nu++;
        }

        return (cap > 0 && n > 0) ? 1 :0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        char[] c = s.toCharArray();
        System.out.println(checkPassword(c, len));
    }
}