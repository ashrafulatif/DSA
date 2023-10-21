class first_LastElemnetOccur {

    static void print(int arr1[], int f, int l) {
        for (int i = f; i < l; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
    }

    static int firstOccur(int arr[], int f, int l, int key) {
        print(arr, f, l);
        // int f = 0;
        // int l = size - 1;
        int foccr = -1;

        // base case
        if (f > l) {
            return -1;
        }

        int mid = f + (l - f) / 2;
        System.out.println("The value of mid: " + arr[mid] + " ");

        if (arr[mid] == key) {

            foccr = mid;
            l = mid - 1;
            int ans= firstOccur(arr, f, l, key);
            if (ans <=foccr) {
                return foccr;
            } else {
                return ans;
            }
        }
        if (arr[mid] < key) {
            return firstOccur(arr, mid + 1, l, key);
        } else {
            return firstOccur(arr, f, mid - 1, key);
        }

        return foccr;
    }

    static int lastOccur(int arr[], int f, int l, int key) {

        print(arr, f, l);
        // int f = 0;
        // int l = size - 1;
        int loccr = -1;
        // base case
        if (f > l) {
            return -1;
        }
        int mid = f + (l - f) / 2;
        System.out.println(arr[mid] + " ");

        if (arr[mid] == key) {
            loccr = mid;
            f = mid + 1;
            int ans = lastOccur(arr, f, l, key);
            if (ans <= loccr) {
                return loccr;
            } else {
                return ans;
            }
        }
        if (arr[mid] < key) {

            return lastOccur(arr, mid + 1, l, key);
        } else if (arr[mid] > key) {
            return lastOccur(arr, f, mid - 1, key);
        }
        return loccr;
    }

    public static void main(String[] args) {

        int arr[] = { 0, 0, 0, 0 };
        int key = 0;
        int size = 4;
        System.out.println("first index: " + firstOccur(arr, 0, size - 1, key));
        System.out.println("Last index: " + lastOccur(arr, 0, size - 1, key));
    }
}