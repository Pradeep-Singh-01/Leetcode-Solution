class Solution {
    private int helper(int[] coins, int amount, int i, int[][] dp){
         if(amount ==0){
            return 0;
        }
        if(i== coins.length){
            return Integer.MAX_VALUE;
        }
         if(dp[i][amount]!=0){
            return dp[i][amount];
         }
       
         int take = Integer.MAX_VALUE;
         int notTake = helper(coins,amount,i+1,dp);
         if(amount>=coins[i]){
            int res = helper(coins, amount - coins[i], i,dp);
            if (res != Integer.MAX_VALUE) {
                take = 1 + res;
            }

         }
         
          
         int val =  Math.min(take,notTake);
           return dp[i][amount] = val;
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length+1][amount+1];
        

        int  ans = helper(coins, amount, 0,dp);
         return ans>=Integer.MAX_VALUE?-1:ans;
        
    }
}