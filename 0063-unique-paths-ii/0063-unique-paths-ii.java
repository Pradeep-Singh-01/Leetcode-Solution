class Solution {
     int unique1( int[][] obstacleGrid,int m, int n,Integer[][] dp ){
        if(m<0 || n<0){
            return 0;
        }
        if(obstacleGrid[m][n]==1){
            return 0;
        }
        if(m==0 && n==0){
            return dp[m][n] = 1;
        } 
        

        
        
        if(dp[m][n]!=null){
            return dp[m][n];
        }
         return  dp[m][n] = unique1(obstacleGrid,m-1,n,dp) + unique1(obstacleGrid,m,n-1,dp);

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        Integer[][] dp= new Integer[obstacleGrid.length][obstacleGrid[0].length];
        return unique1(obstacleGrid,obstacleGrid.length-1,obstacleGrid[0].length-1,dp);
    }
}