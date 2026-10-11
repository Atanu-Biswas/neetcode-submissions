class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        if(len<2) return -1;
        int l=0;
        int r=len-1;
        int max = 0;
        while(l<r){
            if(max<(Math.min(heights[l],heights[r])*(r-l))){
                max=(Math.min(heights[l],heights[r])*(r-l));
            }

            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }

        }

        return max;
    }
}
