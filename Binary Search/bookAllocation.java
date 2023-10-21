import java.lang.*;
import java.util.*;;

class bookAllocation {

    public static boolean isPossible(int arr[], int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum = pageSum + arr[i];
            } else {
                studentCount++;
                if (studentCount > m || arr[i] > mid) {
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }

    public static int bookAlc(int[] arr, int n, int m) {

        int sum = 0;
        int s = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int e = sum;
        int ans = -1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (isPossible(arr, n, m, mid)) {
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
        System.out.print(" Enter the size of the arry: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print(" Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(" Enter the total student: ");
        int m = sc.nextInt();
        System.out.println(" the ans is :" + bookAlc(arr, n, m));
    }
}