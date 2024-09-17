import java.util.Arrays;

class perfectSquare {
    public int solve(int n, int x, int[][] dp) {
        if (n == 0) return 0;
        if (x * x > n) return Integer.MAX_VALUE - 1;

        if (dp[n][x] != -1) return dp[n][x];

        int pick = 1 + solve(n - (x * x), x, dp);
        int notPick = solve(n, x + 1, dp);

        return dp[n][x] = Math.min(pick, notPick);
    }

    public int numSquares(int n) {
        int[][] dp = new int[n + 1][(int) Math.sqrt(n) + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(n, 1, dp);
    }
}