import java.util.Arrays;

class secondLargest {
    public int findLowestCoins(int[] coins, int cur, int amount, int[][] dp) {
        if (cur >= coins.length) return Integer.MAX_VALUE - 1; 
        if (amount == 0) return 0; 

        if (dp[cur][amount] != -1) return dp[cur][amount];
        
        int pick = Integer.MAX_VALUE - 1, notpick = Integer.MAX_VALUE - 1;

        if (coins[cur] <= amount) {
            pick = 1 + findLowestCoins(coins, cur, amount - coins[cur], dp);
        }
        
        notpick = findLowestCoins(coins, cur + 1, amount, dp);
        
        return dp[cur][amount] = Math.min(pick, notpick);
    }
    
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int res = findLowestCoins(coins, 0, amount, dp);
        return (res == Integer.MAX_VALUE - 1) ? -1 : res;
    }
}

