
class rotateArray {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];

        // Fill temp with rotated values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = matrix[n - j - 1][i];
            }
        }

        // Copy back to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(arr);

        // Print final rotated matrix
        for (int[] row : arr) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
