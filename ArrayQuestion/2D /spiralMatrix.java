import java.lang.*;
import java.util.*;

public class spiralMatrix {

    public List<Integer> SpiralOrder(int matrix[][]) {
        List<Integer> al = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        int total = row * col;
        int count = 0;

        // initialise the indexes

        int startRow = 0;
        int endCol = col - 1;
        int endRow = row - 1;
        int startcol = 0;

        while (total > count) {
            // print start row
            for (int index = startcol; count < total && index <= endCol; index++) {
                al.add(matrix[startRow][index]);
                count++;
            }
            startRow++;

            // print last col
            for (int index = startRow; count < total && index <= endRow; index++) {
                al.add(matrix[index][endCol]);
                count++;
            }
            endCol--;

            // print the end row/ last row

            for (int index = endCol; count < total && index <= startcol; index++) {
                al.add(matrix[endRow][index]);
                count++;
            }
            endRow--;

            // print the first col

            for (int index = endRow; count < total && index <= startRow; index++) {
                al.add(matrix[index][startcol]);
                count++;
            }
            startRow++;
        }

        return al;
    }

    public static void main(String[] args) {

        spiralMatrix s= new spiralMatrix();
        int[][] arr = new int[][] { { 2, 3, 4 }, { 1, 2, 7 }, { 2, 6, 9 } };
        System.out.println(s.SpiralOrder(arr));
    }

}
