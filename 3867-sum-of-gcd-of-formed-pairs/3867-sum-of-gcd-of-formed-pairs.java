class Solution {
     public int gcd(int a, int b){
         while(b!=0){
            int rem = a%b;
            a = b; 
            b=rem;
         }
          return a;
     }
    public long gcdSum(int[] nums) {
        int max =-1;
         int n = nums.length;
        int prefixgcd[] = new int[n];
        for(int i=0;i<n;i++){
            max= Math.max(max,nums[i]);
            prefixgcd[i] = gcd(nums[i],max); 
        }
        Arrays.sort(prefixgcd);
        
        int i=0,j=n-1;
        long sum =0;
        while(i<j){
          sum+=gcd(prefixgcd[i],prefixgcd[j]);
          i++;
          j--;
        }
         return sum;


        
    }
}