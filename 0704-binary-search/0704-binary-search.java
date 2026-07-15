class Solution {
    public int search(int[] nums, int target) {
    
        return solve(nums, target,0,nums.length-1);

        
    }
     private int solve(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = (s+e)/2;

        if(nums[mid]==target){
            return mid;
        }  
        else if(nums[mid]>target){
           return solve(nums,target,s,mid-1);
        }else{
            return solve(nums, target,mid+1,e);
        }
        

     }
}