class Solution {
    
    List<String> res;
    String[] digtiToChar= {"", "" ,"abc", "def","ghi", "jkl", "mno", "pqrs", "tuv" ,"wxyz"};
    StringBuilder subRes;
    String digits;

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        subRes= new StringBuilder("");
        res= new ArrayList<>();
        this.digits=digits;
        dfs(0);
        return res;
    }
    
    private void dfs(int idx){
        if(idx==digits.length()){
            res.add(subRes.toString());
            return;
        }
        int digit = digits.charAt(idx) - '0';
        for(char ch: digtiToChar[digit].toCharArray()){
            subRes.append(ch);
            dfs(idx+1);
            subRes.deleteCharAt(subRes.length()-1);
        }
    }
}
