class Solution {
    public int maxArea(int[] height) {
        int start =0; 
        int last = height.length-1;
        int maxarea =0;
        
         while(start<last){
             int heights = Math.min(height[start],height[last]);
             
             int width = last-start;
             int curr = heights*width;
             
             maxarea = Math.max( maxarea, curr);
             
             if(height[start]>height[last]){
                 last--;
             }
             else{
                 start++;
             }
             
              
         }
        return maxarea;
        
        
    }
}