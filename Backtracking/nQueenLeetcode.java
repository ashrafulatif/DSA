
import java.util.*;
class nQueenLeetcode {
    
    public static boolean isSafe(char[][]board, int row, int col){
        //vertical down
        for(int i = row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal left
        for(int i =row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false; 
            }
        }
        //diagonal right
        for(int i = row-1, j= col+1; i>=0 && j<board.length; i--,j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    
    public static void nQueen(char board[][], int row, List<List<String>> out){
        if (row == board.length) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                temp.add(new String(board[i]));
            }
            out.add(temp);
            return;
        }
        for(int i =0; i<board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                nQueen(board, row+1, out); //recur call
                board[row][i] ='.'; //backtrack
            }
        }
    }
    
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        
        char board[][] = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = '.';
            }
        }
        nQueen(board, 0, ans);
        
        return ans;
        
    }
    
    public static void main(String[] args) {
     System.out.println(solveNQueens(4));
    }
}