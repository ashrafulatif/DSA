public class SumArray {

    static int Helpersum(int arr[], int idx, int size, int sum) {
        // base case
        if (size == 0) {
            return 0;
        }
        if (size == 1) {

            return arr[0];
        }
        if (idx == size)
            return sum;
        // RR
        int curSum = sum + arr[idx];

        return Helpersum(arr, idx + 1, size, curSum);
    }

    static int sum(int arr[], int size) {

        return Helpersum(arr, 0, size, 0);
    }

    public static void main(String[] args) {

        int arr[] = { 5, 5, 5, 1 };
        int size = 4;
        System.out.println(sum(arr, size));
    }

}
