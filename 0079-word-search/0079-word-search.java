class Solution {
    public static boolean dfs(char[][] brd, int i, int j, String wrd, int index){
        if(index==wrd.length()) return true;
        if(i<0 || j<0 || i>=brd.length || j>=brd[0].length || brd[i][j]!=wrd.charAt(index)){   
            return false;
        }
        char temp = brd[i][j];
        brd[i][j]='#';
        boolean found = dfs(brd,i+1,j,wrd,index+1) || 
                        dfs(brd,i-1,j,wrd,index+1) ||
                        dfs(brd,i,j+1,wrd,index+1) ||
                        dfs(brd,i,j-1,wrd,index+1);
        brd[i][j]=temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        //DFS with backtracking.
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0) && dfs(board,i,j,word,0) ){
                    return true;
                }
            }
        }
        return false;
    }
}