class Solution {
    public int trap(int[] height) {
        int maxLeft=0;
        int maxRight=0;

        int left =0;
        int right=height.length-1;

        int res=0;

        while(left<right){

            if(height[left]<height[right]){
                maxLeft=Math.max(maxLeft,height[left]);
                res=res+(maxLeft-height[left]);
                left++;
            }else{
                maxRight=Math.max(maxRight,height[right]);
                res=res+(maxRight-height[right]);
                right--;
            }

        }

        return res;
    }
}
