class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashMap<Integer,Set<Character>> rows = new HashMap<>();
       HashMap<Integer,Set<Character>> cols = new HashMap<>();
       HashMap<String,Set<Character>> square = new HashMap<>();
       for(int i=0;i<9;i++){ 
        for(int j=0;j<9;j++){
            if(board[i][j]=='.') continue;
            String squareKey = (i/3)+","+(j/3);
            if(rows.computeIfAbsent(i,k->new HashSet<>()).contains(board[i][j]) ||
                cols.computeIfAbsent(j,k->new HashSet<>()).contains(board[i][j]) ||
                square.computeIfAbsent(squareKey,k->new HashSet<>()).contains(board[i][j])
            ){
                    return false;
            }
            rows.get(i).add(board[i][j]);
            cols.get(j).add(board[i][j]);
            square.get(squareKey).add(board[i][j]);
        }
       }
       return true;
    }
}
