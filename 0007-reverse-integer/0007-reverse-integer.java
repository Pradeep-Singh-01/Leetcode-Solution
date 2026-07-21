class Solution {
     int reverse(int x) {

        int num = 0;
        int rem =0;
        while(x!=0){
            if (num > Integer.MAX_VALUE/10 || num < Integer.MIN_VALUE/10) {
            return 0;
            }
            rem = x% 10;
            
            num =num*10 +  rem;
            x= x/10;
            
            
                
            
        }
         
         
        return  num;
        
    }
}