class Solution {

    List<List<Integer>> res;
    List<Integer> subSet;
    int[] candidates;
    int target;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res= new ArrayList<>();
        subSet= new ArrayList<>();
        this.candidates=candidates;
        Arrays.sort(this.candidates);
        this.target=target;
        dfs(0,0);
        return res;
    }

    public boolean dfs(int idx, int curSum){
        if(curSum==target){
            res.add(new ArrayList<>(subSet));
            return true;
        }
        if(curSum>target || idx==candidates.length){
            return true;
        }

        subSet.add(candidates[idx]);
        dfs(idx+1,candidates[idx]+curSum);
        
        subSet.remove(subSet.size()-1);
        while(idx+1<candidates.length && candidates[idx]==candidates[idx+1]){
            idx++;
        }
        dfs(idx+1,curSum);
        return true;
    }
}
