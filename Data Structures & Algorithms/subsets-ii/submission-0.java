class Solution {
    List<List<Integer>> res;
    List<Integer> subSet;
    int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res=new ArrayList<>();
        subSet=new ArrayList<>();
        this.nums=nums;
        Arrays.sort(this.nums);
        dfs(0);
        return res;
    }

    public void dfs(int idx){
        
        if(idx==nums.length){
            res.add(new ArrayList<>(subSet));
            return;
        }
        
        subSet.add(nums[idx]);
        dfs(idx+1);

        subSet.remove(subSet.size()-1);

        while(idx+1 < nums.length && nums[idx]==nums[idx+1]){
            idx+=1;
        }

        dfs(idx+1);

        return;
    }
}
