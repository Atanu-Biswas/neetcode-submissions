class Solution {

    List<List<Integer>> res;
    List<Integer> subSet;
    int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        res= new ArrayList<>();
        subSet= new ArrayList<>();
        this.nums=nums;
        dfs(0);
        return res;
    }

    public boolean dfs(int idx){
        
        if(idx>=nums.length){
            res.add(new ArrayList<>(subSet));
            return true;
        }

        subSet.add(nums[idx]);
        dfs(idx+1);

        subSet.remove(subSet.size()-1);
        dfs(idx+1);

        return true;

    }
}
