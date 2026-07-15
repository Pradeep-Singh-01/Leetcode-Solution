class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int s = 0;
        int e = letters.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
             if (letters[mid] <= target) {
                s = mid + 1;
                
            } else {
                e = mid - 1;
                ans = mid;
            }
        }
        if(ans>=letters.length||  ans<0){
            return letters[0];
        }
         return letters[ans];

       

    }
}