import java.lang.*;
public class mergesortInversionCnt {

    static long inversionCount(long arr[], long size) {
        return mergeSortInversionCnt(arr, 0, size - 1);
    }

    static long merge(long arr[], long s, long e) {

        long ans = 0;
        int mid = (int) (s + e) / 2;

        int len1 = mid - (int) s + 1; // length of the first half
        int len2 = (int) e - mid; // length of the second half

        long arr1[] = new long[len1];
        long arr2[] = new long[len2];

        // copy the element into the array
        int orginalArrayIdx = (int) s;
        for (int i = 0; i < len1; i++) {
            arr1[i] = arr[orginalArrayIdx++];
        }
        // copy into 2nd array
        orginalArrayIdx = mid + 1;
        for (int i = 0; i < len2; i++) {
            arr2[i] = arr[orginalArrayIdx++];
        }
        // merge array

        int idx1 = 0;
        int idx2 = 0;
        orginalArrayIdx = (int) s;

        while (idx1 < len1 && idx2 < len2) {
            if (arr1[idx1] < arr2[idx2]) {// checks for inversion

                arr[orginalArrayIdx++] = arr1[idx1++];
            } else {
                ans += (len1 - idx1);
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
        return ans;

    }

    public static long mergeSortInversionCnt(long[] arr, long s, long e) {
        // base case
        if (s >= e) {
            return 0;
        }
        long mid = (s + e) / 2;
        // left part
        long inv = mergeSortInversionCnt(arr, s, mid);
        // right part
        inv += mergeSortInversionCnt(arr, mid + 1, e);

        inv += merge(arr, s, e);

        return inv;
    }

    public static void main(String[] args) {

        long arr[] = new long[] { 7, 4, 1, 8, 9, 10, 15, 0 };
        int size = 8;

        System.out.println(inversionCount(arr, size));

        // for (int i = 0; i < size-1; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }
}
