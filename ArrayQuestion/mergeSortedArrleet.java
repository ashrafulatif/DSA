import java.lang.*;
import java.util.*;

public class mergeSortedArrleet {

    public static void merge(int arr1[], int n, int arr2[], int m) {

        int i = n - 1;
        int j = m - 1;
        int k = arr1.length - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            }

            else {
                arr1[k--] = arr2[j--];
            }
        }
        while (j >= 0) {
            arr1[k--] = arr2[j--];

        }

    }
    //print the array
    static void print(int ans[]) {
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr1[] = new int[] { 1, 3, 5, 7, 9, 0, 0, 0 };
        int arr2[] = new int[] { 2, 4, 6 };
        int n = 5;
        int m = 3;
        merge(arr1, n, arr2, m);
        print(arr1);

    }
}
