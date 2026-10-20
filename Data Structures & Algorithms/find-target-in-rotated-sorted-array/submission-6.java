class Solution {
    public int search(int[] nums, int target) {
        int res=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(right+left)/2;

            if(nums[mid]==target){
                res=mid;
                break;
            }

            if(nums[left]<=nums[mid]) //sorted
            {
                if(target<nums[left] || target>nums[mid]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            } else{
                if(nums[mid]>target || nums[right]<target){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }

        
        }
        return res;
    }
}