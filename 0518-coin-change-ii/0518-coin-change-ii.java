class Solution {
    public int change(int amount, int[] coins) {
    Integer[][] dp = new Integer[coins.length][amount + 1];
        int n = coins.length;
        for (int i = 0; i < amount+1; i++) {
            if (i % coins[0] == 0)
                dp[0][i] = 1;
            else {
                dp[0][i] = 0;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int a = 0; a < amount + 1; a++) {
                int pick = 0;
                if (a >= coins[i]) {
                    pick = dp[i][a - coins[i]];

                }
                int nopick = dp[i-1][a];
                dp[i][a] = pick+ nopick;

            }
        }

        int ans = dp[n-1][amount];
        return ans;
    }
}