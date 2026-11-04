class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        
        for(int i=0;i<nums.length-1;i++){
            if(i!=0 && nums[i] == nums[i-1]){
                continue;
            }
            int left= i+1;
            int right= nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right] > 0 ){
                    right--;
                }else if(nums[i]+nums[left]+nums[right] < 0 ){
                    left++;
                }else{
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                left++;
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
                }
            }
        }

        return res;
    }
}
