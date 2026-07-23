class Solution {
    public int longestPalindromeSubseq(String s) {
        String t = new StringBuilder(s).reverse().toString();
        int dp[][] = new int[t.length() + 1][s.length() + 1];
         for(int i=1;i<=t.length(); i++){
             for(int j=1;j<=s.length();j++){
                 int ans=0;
                  if(s.charAt(j-1)==t.charAt(i-1)){
                    ans = 1+ dp[i-1][j-1];
                  }
                   else{
                     ans = Math.max(dp[i][j-1], dp[i-1][j]);
                   }
                    dp[i][j] = ans;
             }
         }
          return dp[t.length()][s.length()];
        
    }
}