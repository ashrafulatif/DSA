public class searchElement {

    public static boolean searchMatrix(int mat[][], int target) {
        int row = mat.length;
        int col = mat[0].length;

        int s = 0;
        int e = row * col - 1;
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (mat[mid / col][mid % col] == target) {
                return true;
            } else if (mat[mid / col][mid % col] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[][] = new int[][] { { 1, 2, 4 }, { 1, 2, 4 }, { 3, 5, 6 } };
        int n = 3;
        System.out.println(searchMatrix(arr, n));
    }

}
