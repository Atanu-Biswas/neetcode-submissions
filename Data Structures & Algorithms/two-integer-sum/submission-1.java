class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hashMap.put(target-nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i]) && hashMap.get(nums[i])!=i){
                return new int[]{i, hashMap.get(nums[i])};
            }
        }
        return null;
    }
}
