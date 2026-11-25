class Solution {
    char[][] board;
    String word;
    int m,n;

    public boolean exist(char[][] board, String word) {
        
        this.board=board;
        this.word=word;

        m= board.length;
        n= board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0)==board[i][j]){
                    if(search(0,i,j)) return true;
                }
            }
        }

        return false;
    }
    
    public boolean search(int idx, int x, int y){

        if(idx==word.length()) return true;

        if(x<0 || y<0 || x>m-1 || y>n-1 || word.charAt(idx)!=board[x][y]){
            return false;
        }

        char temp= board[x][y];
        board[x][y]='#';

        boolean dfs=
            search(idx+1,x+1,y) ||
            search(idx+1,x-1,y) ||
            search(idx+1,x,y+1) ||
            search(idx+1,x,y-1);
        
        board[x][y]=temp;

        return dfs;
    }
}
