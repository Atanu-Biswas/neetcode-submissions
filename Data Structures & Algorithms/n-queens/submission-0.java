class Solution {

    List<List<String>> res;
    int n;

    public List<List<String>> solveNQueens(int n) {
        res=new ArrayList<>();
        this.n=n;
        List<StringBuilder> list= new ArrayList<>();
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<n;i++){
            sb.append(".");
        }
        for(int i=0;i<n;i++){
            list.add(new StringBuilder(sb.toString()));
        }
        solve(list,0);
        return res;
    }

    void solve(List<StringBuilder> ls, int row){
        if(row == n){
            List<String> str=new ArrayList<>();
            for(int i=0; i<n;i++){
                str.add(ls.get(i).toString());
            }
            res.add(str);
            return;
        }
        for(int i=0; i<n;i++){
            if(isValid(ls,row,i)){
                ls.get(row).setCharAt(i,'Q');
                solve(ls,row+1);
                ls.get(row).setCharAt(i,'.');
            }
        }
    }

    

    private boolean isValid(List<StringBuilder> board, int x, int y){

        for(int i=0;i<n;i++){

            if(board.get(x).charAt(i)=='Q') return false;

            if(board.get(i).charAt(y)=='Q') return false;

            if(x+i<n && y+i<n){
                if(board.get(x+i).charAt(y+i)=='Q') return false;
            }
            if(x-i>=0 && y-i>=0){
                if(board.get(x-i).charAt(y-i)=='Q') return false;
            }
            if(x+i<n && y-i>=0){
                if(board.get(x+i).charAt(y-i)=='Q') return false;
            }
            if(x-i>=0 && y+i<n){
                if(board.get(x-i).charAt(y+i)=='Q') return false;
            }
        }
        return true;
    }
}
