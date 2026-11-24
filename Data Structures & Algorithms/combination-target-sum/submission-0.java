class Solution {

    List<List<Integer>> res;
    List<Integer> subSet;
    int[] nums;
    int target;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res= new ArrayList<>();
        subSet= new ArrayList<>();
        this.nums=nums;
        this.target=target;
        dfs(0,0);
        return res;
    }

    public boolean dfs(int curRes, int idx){
        if(curRes==target){
                res.add(new ArrayList<>(subSet));
                return true;
            }
            if(curRes>target){
                return true;
            }
        for(int i=idx;i<nums.length;i++){
            subSet.add(nums[i]);
            dfs(curRes+nums[i],i);
            subSet.remove(subSet.size()-1);
        }
        return true;
    }
}
