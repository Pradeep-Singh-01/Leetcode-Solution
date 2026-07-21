class Solution {
    // // int foo(int cost[],int i){
    //     if(i==cost.length-1){
    //         return cost[i]
    //     }
    // }
    int recc(int cost[], int i,int[] dp){
        if(i==0 || i==1){
           return 0;
         
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int one = cost[i-1] +recc(cost,i-1,dp);
        int two =cost[i-2]+ recc(cost,i-2,dp);
        return  dp[i] = Math.min(one, two);
    }
    public int minCostClimbingStairs(int[] cost) {
        // int []dp = new int[cost.length+1];
        // Arrays.fill(dp,-1);
        // return recc(cost, cost.length,dp);
        int step=0;
        int step2 =0;
         int ans=0;
        for(int i=2;i<=cost.length;i++){
            int one = cost[i-1]+step;
            int two =cost[i-2]+step2;
            step2 = step;
            ans = Math.min(one,two);
            step = ans;
        }
        return ans;

        
    }
}