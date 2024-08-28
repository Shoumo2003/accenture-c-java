import java.util.Scanner;

public class tossAndScore {
    public static int solve(String str) {
        int count = 0;
        int score = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'H'){
                score += 2;
                count += 1;
            } else if (str.charAt(i) == 'T') {
                score -= 1;
                count = 0;
            }

            if (count == 3) return score;
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
        sc.close();
    }
}
