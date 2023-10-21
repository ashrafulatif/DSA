import java.lang.*;
import java.util.*;


public class mergeSortArr {

    public static void merge(int arr1[], int arr2[], int arr3[]) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            }

            else {
                arr3[k++] = arr2[j++];
            }
        } 
        // copy the remaining first array1
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];

        }
        // copy the remaining 2nd array2
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];

        }
        // print the array
    }
    static void print(int arr3[]) {
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr1[] = new int[] { 1, 3, 5, 7, 9 };
        int arr2[] = new int[] { 2, 4, 6 };
        int arr3[] = new int[8];
        merge(arr1, arr2, arr3);
        print(arr3);

    }
}
