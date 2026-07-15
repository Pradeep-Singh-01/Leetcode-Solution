class Solution {
    public int gcdOfOddEvenSums(int n) {
    int odd = n*n;
    int even = n*n +n;
    while(odd!=0){
        int rem = even%odd;
        even = odd;
        odd = rem ;
    }
     return even;
        
    }
}