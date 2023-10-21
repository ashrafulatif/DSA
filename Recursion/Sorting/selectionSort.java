public class selectionSort {

    static void Sort(int arr[], int idx, int n) {
        // base case
        if (n == idx) {
            return;
        }
        int smallIdx = idx;

        for (int i = idx + 1; i < n; i++) {
            if (arr[smallIdx] > arr[i]) {
                smallIdx = i;
            }
        }
        // swap
        int temp = arr[idx];
        arr[idx] = arr[smallIdx];
        arr[smallIdx] = temp;

        // recursive call
        Sort(arr, idx + 1, n);

    }

    public static void main(String[] args) {

        int arr[] = new int[] { 64, 25, 12, 22, 11 };
        int n = 5;
        Sort(arr, 0, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
