class Solution {
    private int binary(int[] nums, int target, int ans,  boolean isFirst,int s, int e){
        if(s>e){
            return ans;
        }
        int mid = s + (e-s)/2;
        if(nums[mid]==target){
            ans =mid;
            if(isFirst){
                // e = mid-1;
              return  binary(nums,target,ans,isFirst,s,mid-1);
            }
            else{
              return binary(nums,target,ans,isFirst,mid+1,e);
            }
        }
        else if(target>nums[mid]){
           return binary(nums,target,ans,isFirst,mid+1,e);

        }else{
           return binary(nums,target,ans,isFirst,s,mid-1);
        }
        
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int ans[] =new int[2];
        ans[0] = binary(nums,target,-1,true,0,nums.length-1);
        ans[1] = binary(nums,target,-1,false,0,nums.length-1);
         return ans;        
    }
}