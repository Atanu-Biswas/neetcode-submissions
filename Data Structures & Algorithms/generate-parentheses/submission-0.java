class Solution {
    
    List<String> res;
    StringBuilder subStr;
    int n;

    public List<String> generateParenthesis(int n) {
        res= new ArrayList<>();
        subStr= new StringBuilder("");
        this.n=n;
        dfs(0,0);
        return res;
    }

    private void dfs(int open, int close){
        if(subStr.length()==n*2){
            res.add(subStr.toString());
            return;
        }
        
        if(open<n){
            subStr.append("(");
            dfs(open+1,close);
            subStr.deleteCharAt(subStr.length()-1);
        }
        
        if(open>close){
            subStr.append(")");
            dfs(open,close+1);
            subStr.deleteCharAt(subStr.length()-1);
        };
    }
}
