class Solution {
    public int maxArea(int[] heights) {
        int res=0;
        int left=0;
        int right=heights.length-1;

        while(left<right){
            res=Math.max(res, (right-left)*Math.min(heights[right],heights[left]));
            if(heights[right]>heights[left]){
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
}
