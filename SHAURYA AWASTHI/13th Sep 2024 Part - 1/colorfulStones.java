import java.util.Scanner;

public class colorfulStones {
    public static int solve(String s, String t) {
        int n = s.length();
        int idx = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(idx)) {
                idx++;
            }
        }

        return idx + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        System.out.println(solve(s, t));
        scanner.close();
    }
}

