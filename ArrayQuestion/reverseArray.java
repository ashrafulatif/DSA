import java.lang.*;
import java.util.*;

public class reverseArray {

    static void reverse(int arr[], int n) {
        int s = n + 1;
        int e = arr.length - 1;

        while (s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.print("Enter the starting index for sorting: ");
        int n = sc.nextInt();
        reverse(arr, n);
    }
}
