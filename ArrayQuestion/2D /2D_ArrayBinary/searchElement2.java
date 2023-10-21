import java.lang.*;

public class searchElement2 {
    static boolean searchMatrix(int mat[][], int target) {
        int row = mat.length;
        int col = mat[0].length;

        int rowIndex = 0;
        int colIndex = col - 1;

        while (rowIndex < row && colIndex >= 0) {
            int element = mat[rowIndex][colIndex];
            if (element == target) {
                return true;
            } else if (element < target) {
                rowIndex++;
            } else {
                colIndex--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[][] = new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 } };
        int n = 50;
        System.out.println(searchMatrix(arr, n));
    }
}
