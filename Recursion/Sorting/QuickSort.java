class QuickSort {

    static void quickSort(int arr[], int s, int e) {
        // base case
        if (s >= e) {
            return;
        }
        // take the partiion
        int p = partition(arr, s, e);
        // for right side
        quickSort(arr, p + 1, e);
        // for left side
        quickSort(arr, s, p - 1);
    }

    static int partition(int arr[], int s, int e) {
        int pivot = arr[s]; // pivot index
        int count = 0;
        // count element which less than pivot
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }

        int pivotIndex = s + count; // pivot index
        // put pivot into right position
        int temp = pivot;
        arr[s] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        int i = s;
        int j = e;

        // make smaller element lie before pivot and large element after pivot;

        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }

        return pivotIndex;

    }

    public static void main(String[] args) {

        int arr[] = new int[] { 10, 2, 3, 2, 4, 5 };
        int size = 6;

        quickSort(arr, 0, size-1 );

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}