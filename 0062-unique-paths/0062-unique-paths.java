class Solution {
    int unique1(int m, int n,Integer[][] dp ){
        if(m==1 && n==1){
            return dp[m][n] = 1;
        }
        if(m==0 || n==0){
            return 0;
        }
        
        if(dp[m][n]!=null){
            return dp[m][n];
        }
         return  dp[m][n] = unique1(m-1,n,dp) + unique1(m,n-1,dp);

    }
    public int uniquePaths(int m, int n) {

        Integer[][] dp = new Integer[m+1][n+1];
        return unique1(m,n,dp);
        
    }
}