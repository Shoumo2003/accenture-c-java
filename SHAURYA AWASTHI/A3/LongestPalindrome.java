import java.util.Scanner;

public class LongestPalindrome {
    public static String longestPalindrome (String s) {
        int n = s.length();
        if (n <= 1) {
            return s;
        }
        int st = 0;
        int maxLen = 1;

        // odd
        for (int i = 0; i < n; i++) {
            int l = i, r = i;

            while (l >= 0 && r < n) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }

            int len = r - l - 1;
            if (maxLen < len) {
                maxLen = len;
                st = l + 1;
            }
        }

        // even
        for (int i = 0; i < n - 1; i++) {
            int l = i, r = i + 1;

            while (l >= 0 && r < n) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }

            int len = r - l - 1;
            if (maxLen < len) {
                maxLen = len;
                st = l + 1;
            }
        }

        return s.substring(st, st + maxLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.err.println(longestPalindrome(str));
        sc.close();
    }
}