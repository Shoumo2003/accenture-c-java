import java.util.Scanner;

public class interchangeChars {
    public static String solve (String str, char ch1, char ch2) {
        int n = str.length();
        StringBuilder result = new StringBuilder(str);

        for (int i = 0; i < n; i++) {
            if (result.charAt(i) == ch1) {
                result.setCharAt(i, ch2);
            } else if (result.charAt(i) == ch2) {
                result.setCharAt(i, ch1);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        System.out.println(solve(s, ch1, ch2));
        sc.close();
    }
}