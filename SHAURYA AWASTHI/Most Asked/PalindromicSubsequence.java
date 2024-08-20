import java.util.Scanner;

public class PalindromicSubsequence {
    public static int solve (String str, int i, int j, int[][] dp) {
        if (i == j) return 1;

        if (i > j) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (str.charAt(i) == str.charAt(j)) {
            return dp[i][j] = 1 + solve(str, i + 1, j, dp) + solve(str, i, j - 1, dp);
        } else {
            return dp[i][j] = solve(str, i + 1, j, dp) + solve(str, i, j - 1, dp) - solve(str, i + 1, j - 1, dp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int n = str.length();
        int[][] dp = new int [n][n];
        for  (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }

        System.out.println(solve(str, 0, str.length() - 1, dp));
        sc.close();
    }
}
