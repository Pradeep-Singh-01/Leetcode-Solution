class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[0]-b[0]);
        int  n = pairs.length;
        int lis[] =  new int[n];
        Arrays.fill(lis,1);
        int maxln =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(pairs[i][0]>pairs[j][1]){
                    lis[i] = Math.max(lis[i],1+lis[j]);
                }
            }
            maxln = Math.max(maxln,lis[i]);
        }
        return maxln;
    }
}