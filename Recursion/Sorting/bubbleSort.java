public class bubbleSort {

    static void checkSort(int arr[], int n) {
        // base case
        if (n == 0 || n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        checkSort(arr, n - 1);
    }

    public static void main(String[] args) {

        int arr[] = { 6, 2, 1, 7, 9, 3 };
        int n = 6;
         checkSort(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
