class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<9; i++ ){
            for(int j=0; j<9; j++){
                if(!isvalid(i,j,board)) return false;
            }
        }
        return true;
    }

    public boolean isvalid(int r, int c, char[][] board){
        if(board[r][c]=='.') return true;
        for(int i=0; i<9; i++){
            if(r!=i && board[r][c]==board[i][c]) return false;
            if(c!=i && board[r][c]==board[r][i]) return false;
            if( r!=3*(r/3)+(i/3) && c!= 3*(c/3)+(i%3) &&
            board[r][c]== board[3*(r/3)+(i/3)][3*(c/3)+(i%3)]) return false;
        }
        return true;
    }
}
