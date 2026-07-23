class Solution {
    int coin(int[] coins, int amount, int i, Integer[][] dp) {
        if (amount == 0) {
            return 0;
        }
        if (i == 0) {
            if (amount % coins[0] == 0)
                return amount / coins[0];
            return (int) 1e9;
        }
        if (dp[i][amount] != null) {
            return dp[i][amount];
        }

        int pick = (int) 1e9;
        if (amount >= coins[i]) {
            pick = 1 + coin(coins, amount - coins[i], i, dp);

        }
        int nopick = coin(coins, amount, i - 1, dp);
        return dp[i][amount] = Math.min(pick, nopick);
    }

    public int coinChange(int[] coins, int amount) {
        Integer[][] dp = new Integer[coins.length][amount + 1];
        int n = coins.length;
        for (int i = 0; i < amount+1; i++) {
            if (i % coins[0] == 0)
                dp[0][i] = i / coins[0];
            else {
                dp[0][i] = (int) 1e9;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int a = 0; a < amount + 1; a++) {
                int pick = (int) 1e9;
                if (a >= coins[i]) {
                    pick = 1 + dp[i][a - coins[i]];

                }
                int nopick = dp[i-1][a];
                dp[i][a] = Math.min(pick, nopick);

            }
        }

        int ans = dp[n-1][amount];
        return (ans >= (int) 1e9) ? -1 : ans;
    }
}