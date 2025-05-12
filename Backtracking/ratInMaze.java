public class ratInMaze {
    public static boolean isSafe (int maze[][] ,int row , int col){
        
        return row>=0 && col>=0 && row< maze.length&& col<maze.length && maze[row][col]==1;
    }
    
    static int count =0;
    public static void ratInMazeSolver(int maze[][], int row, int col){
        
        //base case
        if (row == maze.length-1 && col == maze.length-1){
            Print(maze);
            count = count + 1;
            return;
        }
        if (isSafe(maze, row, col)){
            maze[row][col] = 2;
                
            ratInMazeSolver (maze,row, col+1);
            ratInMazeSolver (maze,row+1, col);
                
            maze[row][col] = 1;
        }
    }
    
    public static void Print(int maze[][]){
        System.out.println("---------------");
        for (int i=0; i<maze.length;i++){
            for(int j =0; j< maze.length; j++){
                System.out.print(maze[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1, 1, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        
        ratInMazeSolver(maze, 0, 0);
        System.out.println("Total solution: "+count);

    }
}
