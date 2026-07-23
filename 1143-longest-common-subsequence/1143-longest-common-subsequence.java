class Solution {
    public int longestCommonSubsequence(String t, String s) {



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



















//          if(s.length()==0 ){





//              return 0;
//          }
//          if(t.length() == 0){
//               return 0;
//          }
//           int j=0; 
         
//          if(t.length()>s.length()){
           
//         for(int i=0; i<t.length(); i++){
            
             
//              if( j < s.length() && s.charAt(j) == t.charAt(i)){
//                   j++;
//              }
            
//             //  if((i==(t.length()-1) ) && (j!=(s.length()))){
//             //      return false;
//             //  }
             
//         }
//          }

//  else{

//     for(int i=0; i<s.length(); i++){
            
             
//              if( j < t.length() && t.charAt(j) == s.charAt(i)){
//                   j++;
//              }

//  }
//          }
//          return j;
        
//     }
// }