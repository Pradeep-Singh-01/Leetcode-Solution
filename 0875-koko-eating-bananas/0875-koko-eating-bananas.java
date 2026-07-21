class Solution {
    public boolean isPossible(int[] piles,int h ,long mid){
        int currh=0;
        // int currp =0;
        for(int i=0;i<piles.length;i++){
            currh += (int)((long)piles[i]/mid);
            if((long)piles[i]%mid!=0){
                currh+=1;
            }
            if(currh>h){
                return false;
            }
        }
         return true;

    }
    public int minEatingSpeed(int[] piles, int h) {
        if(h<piles.length){
            return -1;
        }
        long s =1;
        long e = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            e = Math.max(e,piles[i]);

        }
        long res = -1;

        while(s<=e){
            long mid = s + (e-s)/2;
             if(isPossible(piles, h, mid)){
                e = mid-1;
                res =  mid;
             } else{
                s = mid+1;
             }
        }
         return  (int)res;
        
    }
}