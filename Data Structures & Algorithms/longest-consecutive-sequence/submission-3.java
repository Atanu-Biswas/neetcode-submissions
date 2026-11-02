class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       if(nums.length==0){return 0;}
       for(int num: nums){
        set.add(num);
       }
       int res = 0;
       for(int num: nums){
        if(!set.contains(num-1)){
        int longest = 0;
        while(set.contains(num+longest)){
            longest++;
        }
        res=Math.max(longest,res);
        }
       }
       return res;
    }
}
