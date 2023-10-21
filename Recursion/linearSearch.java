import java.rmi.dgc.Lease;

public class linearSearch {

    static boolean linearSearch_Helper(int arr[], int idx, int size, int key) {
        // base case
        if (size == 0) {
            return false;
        }
        if (arr[idx] == key) {
            return true;
        } else {
            boolean remainPart = linearSearch_Helper(arr, idx + 1, size - 1, key);

            return remainPart;
        }
    }

    static boolean LinSearch(int arr[], int size, int key) {

        return linearSearch_Helper(arr, 0, size, key);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 5, 7, 9 };
        int size = 5;
        int key = 1;
        boolean ans = LinSearch(arr, size, key);
        if (ans) {
            System.out.println(" found");
        } else {
            System.out.println("not found");
        }
    }
}
