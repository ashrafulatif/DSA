import java.lang.*;
import java.util.*;

public class aggressiveCows {

    static boolean isPossible(int arr[], int n, int k, int mid) {
        int cowsCount = 1;
        int lastpos = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] - lastpos >= mid) {
                cowsCount++;
                if (cowsCount == k) {
                    return true;
                }
                lastpos = arr[i];
            }

        }
        return false;

    }

    static int aggressiveCow(int arr[], int n, int k) {
        int s = 0;
        int e = arr[n - 1];
        int ans = -1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (isPossible(arr, n, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the arry size: ");
        int n = sc.nextInt();
        System.out.println("enter the total cows ");
        int k = sc.nextInt();
        System.out.println("enter the elements: ");

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the answer is: " + aggressiveCow(arr, n, k));

    }
}
