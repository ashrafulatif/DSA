public class sodokuSolver {


    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //row
        for (int i=0; i<= 8;i++){
            if(sudoku[row][i]==digit){
                return false;
            }
        }
        //col
        for (int i =0; i<=8; i++){
            if (sudoku[i][col]==digit){
                return false;
            }
        }
        //for grid
        int sc = (col/3)*3;
        int sr = (row/3)*3;

        for (int i = sr; i< sr+3; i++){
            for (int j =sc; j< sc+3; j++){
                if (sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        
        return true;
    }


    public static boolean soduSolver (int sudoku[][], int row, int col){

        //base case
        if (row==9){
            return true;
        }

        //next col +row
        int nextRow = row, nextCol= col+1;
        if (col+1==9){
            nextRow = row+1;
            nextCol=0;
        }

         if (sudoku[row][col]!=0){
            return soduSolver(sudoku, nextRow,nextCol);
         }

        for (int digit = 1; digit<=9; digit++){

            if (isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if (soduSolver(sudoku, nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col] =0;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        
       int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}};

            if (soduSolver(sudoku, 0, 0)){
                System.out.println("solution found");
            }
            else{
                System.out.println("not found");
            }

    }
}
