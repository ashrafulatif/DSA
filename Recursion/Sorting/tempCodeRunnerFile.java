public class MergeSort {

    static void merge(int arr[], int s, int e) {
        int mid = (s + e) / 2;

        int len1 = mid - s + 1; // length of the first half
        int len2 = e - mid; // length of the second half

        int arr1[] = new int[len1];
        int arr2[] = new int[len2];

        // copy the element into the array
        int orginalArrayIdx = s;
        for (int i = 0; i < len1; i++) {
            arr1[i] = arr[orginalArrayIdx++];
        }
        // copy into 2nd array
        orginalArrayIdx = mid + 1;
        for (int i = 0; i < len2; i++) {
            arr2[i] = arr[orginalArrayIdx++];
        }
        // merge array
        orginalArrayIdx = s;
        int idx1 = 0;
        int idx2 = 0;

        while (idx1 < len1 && idx2 < len2) {
            if (arr1[idx1] < arr2[idx2]) {
                arr[orginalArrayIdx++] = arr1[idx1++];
            } else {
                arr[orginalArrayIdx++] = arr2[idx2++];
            }
        }
        while (idx1 < len1) // if one array element remaining
        {
            arr[orginalArrayIdx++] = arr1[idx1++];
        }
        while (idx2 < len2) // if one array element remaining

        {
            arr[orginalArrayIdx++] = arr2[idx2++];
        }

    }

    static void mergeSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = (s + e) / 2;
        // left part
        mergeSort(arr, s, mid);
        // right part
        mergeSort(arr, mid + 1, e);

        merge(arr, s, e);
    }

    public static void main(String[] args) {

        int arr[] = new int[] { 7, 4, 1, 8, 9, 10, 15, 0 };
        int size = 8;
        mergeSort(arr, 0, size - 1);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
