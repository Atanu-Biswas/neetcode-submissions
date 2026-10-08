class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] res = new int[nums.length];
        int prefix=1;
        int suffix=1;
        pre[0] = 1;
        suf[nums.length-1]= 1;
        for(int i=1;i<nums.length;i++){
            prefix=prefix*nums[i-1];
            pre[i]=prefix;
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix=suffix*nums[i+1];
            suf[i]=suffix;
        }
        for(int i=0;i<nums.length;i++){
            res[i]=pre[i]*suf[i];
        }
        return res;
    }
}  
