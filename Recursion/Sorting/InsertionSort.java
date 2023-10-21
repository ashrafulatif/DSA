import java.util.Currency;

public class InsertionSort {

    static void Sort(int arr[], int idx, int size) {
        // base case
        if (idx == size) {
            return;
        }

        int temp = arr[idx];
        int j = idx - 1;

        while (j >= 0) {

            if (temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            } else {
                break;
            }
            arr[j + 1] = temp;
        }
        Sort(arr, idx + 1, size);
    }

    public static void main(String[] args) {

        int arr[] = new int[] { 64, 25, 12, 22, 11 };
        int n = 5;
        Sort(arr, 1, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
