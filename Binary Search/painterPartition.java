import java.lang.*;
import java.util.*;

public class painterPartition {

    public static boolean isPossible(int arr[], int n, int k, int mid) {
        int paintCount = 1;
        int painterSum = 0;

        for (int i = 0; i < n; i++) {
            if (painterSum + arr[i] <= mid) {
                painterSum = painterSum + arr[i];
            } else {
                paintCount++;
                if (paintCount > k || arr[i] > mid) {
                    return false;
                }
                painterSum = arr[i];
            }
        }
        return true;
    }

    public static int paintALC(int arr[], int n, int k) {
        int sum = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int e = sum;
        int ans = -1;
        int mid = s + (e - s) / 2;
        while (s <= e) {

            if (isPossible(arr, n, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the arry size: ");
        int n = sc.nextInt();
        System.out.println("enter the total painter: ");
        int k = sc.nextInt();
        System.out.println("enter the arry: ");

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the answer is: " + paintALC(arr, n, k));

    }
}
