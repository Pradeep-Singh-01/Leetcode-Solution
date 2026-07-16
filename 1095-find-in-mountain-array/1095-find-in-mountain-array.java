/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
         int r =arr.length() -1;
        int l =0;
         while(l<r)
         {
             
             int mid= (l+r)/2;
              if(arr.get(mid)>arr.get(mid+1)){
                  r = mid;
              }
              else{
                  l= mid + 1;
              }
         }
          int ri = binary(0,l,true,arr,target);
          int lef = binary(l+1,arr.length()-1,false,arr,target);
         return (ri!=-1)? ri: lef;
        
    }
     public int binary(int l, int r, boolean isl,MountainArray arr,int target){
        
          while(l<=r){
            int mid = l + (r-l)/2;
             if(arr.get(mid) ==target){
                return mid;
             }
             else if(isl){
                if(arr.get(mid)>target){
                    r = mid-1;
                }
                else{
                    l= mid+1;
                }
             }
             else{
                if(arr.get(mid)<target){
                    r = mid-1;
                }
                else{
                    l  = mid+1;
                }
             }

          }
          return -1;


     }
}