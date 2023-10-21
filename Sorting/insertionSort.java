import java.lang.*;
import java.util.*;

public class insertionSort {

    static void insertion(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {

                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    static void Display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 50, 20, 10, 100 };
        insertion(arr);
        Display(arr);
    }
}
