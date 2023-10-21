import java.lang.*;
import java.util.*;

public class printWave {

    static void wavePrint(int arr[][], int nrows, int ncol) {
        int ans[] = new int[nrows * ncol];
        int idx = 0;
        for (int i = 0; i < ncol; i++) {
            // for odd number - bottom up
            if (i % 2 != 0) {

                for (int j = nrows - 1; j >= 0; j--) {
                    ans[idx++] = arr[j][i];
                }
            } else // for even number - top to bottom
            {
                for (int j = 0; j < nrows; j++) {
                    ans[idx++] = arr[j][i];
                }
            }

        }

        for (int j = 0; j < ans.length; j++) {

            System.out.print(ans[j] + " ");
        }
    }

    public static void main(String[] args) {
        int nrows = 3;
        int ncol = 3;
        int arr[][] = new int[][] { { 2, 1, 7 }, { 3, 5, 9 }, { 4, 6, 10 } };
        wavePrint(arr, nrows, ncol);
    }
}
