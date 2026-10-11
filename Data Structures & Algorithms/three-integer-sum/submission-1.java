class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        int length = nums.length;
        if(length < 3) return result;

        Arrays.sort(nums);

        for(int i=0;i<length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = length -1;
            while(left<right){
            if(nums[i]+nums[left]+nums[right] < 0){
                left++;
            } else if (nums[i]+nums[left]+nums[right] > 0){
                right--;
            } else {
                result.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                left++;
            
            while(left<right && nums[left]==nums[left-1]){
                left++;
            }
            }
        }
        
        }
        return result;
    }
}
