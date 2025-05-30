public class nQueen {


    public static boolean isSafe(char board[][], int row , int col ) {
        
        //check above => vertical up
        for (int i=row-1; i>=0; i-- ){
            if (board[i][col] == 'Q'){
                return false;
            }
        }
        //chceck diagonal left up

        for (int i = row-1,j = col-1; i>=0 &&j>=0; i--, j-- ){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        //check diagonal right
        for (int i = row-1, j= col+1; i>=0 &&j<board.length; i--,j++ ){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    static int count = 0;
    
    public static void nQueens(char board[][], int row) {
        
        //base case 
        if (row==board.length){
            count++;
            printBoard(board);
            return;
        }

        //column loop
        for (int j=0; j<board.length; j++){

            if (isSafe(board, row, j)){

                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] ='X';
            }
           ;
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("---------------");
        for (int i =0; i< board.length; i++){
            for (int j=0; j< board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        char board[] [] = new char[n][n];

        //initialize the board
        for (int i =0; i< n; i++){
            for (int j =0;j<n; j++){
                board[i][j] = 'x';
            }
        }

        nQueens( board, 0);

        System.out.println("Total ways to solve: "+count);
    }
}
