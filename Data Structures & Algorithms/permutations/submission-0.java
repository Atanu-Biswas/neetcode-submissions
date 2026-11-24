class Solution {

    List<List<Integer>> res;
    List<Integer> subSet;
    List<Integer> array;

    public List<List<Integer>> permute(int[] nums) {
        res= new ArrayList<>();
        subSet= new ArrayList<>();
        array= new ArrayList<>();
        for(int i: nums){
            array.add(i);
        }
        dfs(array);
        return res;
    }
    private boolean dfs(List<Integer> array){
        if(array.size()==0){
            res.add(new ArrayList<>(subSet));
            return true;
        }
        for(int i=0;i<array.size();i++){
            int cur= array.remove(i);
            subSet.add(cur);
            dfs(array);
            subSet.remove(subSet.size() - 1);
            array.add(i, cur);
        }
        return true;
    }
}