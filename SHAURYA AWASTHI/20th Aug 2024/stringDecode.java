import java.util.Scanner;

public class stringDecode {
    public static String solve(String s) {
        StringBuilder ans = new StringBuilder();

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                ans.append((char) ('A' + count - 1));
                count = 0;
            }
        }
        ans.append((char) ('A' + count - 1));
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(solve(s));
        sc.close();
    }
}