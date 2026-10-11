class Solution {
    public int trap(int[] height) {
        int len = height.length;
        
        int[] left = new int[len];
        left[0]=height[0];
        int[] right = new int[len];
        right[len-1]=height[len-1];

        int res = 0;

        for(int i=1;i<len;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }

        for(int i=len-2;i>=0;i--){
           right[i]=Math.max(height[i],right[i+1]);
        }

        for(int i=1;i<len;i++){
            res=res+(Math.min(left[i],right[i]) - height[i]);
        }

        return res;

    }
}
