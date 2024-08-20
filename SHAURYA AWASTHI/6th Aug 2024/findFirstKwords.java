import java.util.Scanner;

public class findFirstKwords {
    public static String solve(String s, int k) {
        int n = s.length();
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                c++;
                if (c == k) return s.substring(0, i);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

        System.out.println(solve(s, k));
        sc.close();
    }
}
