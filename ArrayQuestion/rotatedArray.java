import java.lang.*;
import java.util.*;

public class rotatedArray {

    static void rotatedArr(int arr[], int key) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[(i + key) % arr.length] = arr[i];
        }
        // copy
        for (int i = 0; i < arr.length; i++) {

            arr[i] = temp[i];
        }
        // print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = new int[] { -1, -100, 3, 99 };
        rotatedArr(arr, 2);

    }
}
