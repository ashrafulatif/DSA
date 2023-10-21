class binarySearch {

    static void print(int arr[], int s, int e) {
        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static boolean BinSearch(int arr[], int s, int e, int key) {

        System.out.print("");
        print(arr, s, e);
        // base case
        if (s > e) {
            return false;
        }

        int mid = s + (e - s) / 2;

        System.out.println("the value of mid " + arr[mid]);

        if (arr[mid] == key) {

            return true;
        }
        if (arr[mid] < key) {
            return BinSearch(arr, mid + 1, e, key);
        } else {
            return BinSearch(arr, s, mid - 1, key);
        }

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 10, 14, 18, 22, 38, 49, 222 };
        int size = 10;
        int key = 222;

        Boolean ans = BinSearch(arr, 0, size - 1, key);

        if (ans) {
            System.out.println(" the number is found");
        } else {
            System.out.println(" the number is not found");
        }
    }
}