import java.util.Scanner;

public class goalCount {
    public static String solve(String s) {
        int A = 0, B = 0;

        for (int i = 4; i < s.length(); i += 6) {
            if (s.charAt(i) == 'A') A++;
            else B++;
        }
        return (A > B) ? "TeamA" : "TeamB";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(solve(s));
        scanner.close();
    }
}

