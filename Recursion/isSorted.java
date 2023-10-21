// public class isSorted {

//     static boolean checkSort(int arr[], int size) {

//         return shortHlper(arr, 1, size);

//     }

//     static boolean shortHlper(int arr[], int idx, int size) {
//         if (size == 0 || size == 1) {
//             return true;
//         }
//         if (arr[idx - 1] > arr[idx]) {
//             return false;
//         } else {

//             Boolean ans = shortHlper(arr, idx + 1, size - 1);
//             return ans;
//         }
//     }

//     public static void main(String[] args) {

//         int[] arr = { 2, 4, 5, 1, 15 };
//         boolean ans = checkSort(arr, 5);
//         if (ans)
//             System.out.println("Array is Sorted");
//         else
//             System.out.println("Array is unsorted");
//     }
// }

class isSorted {

    public static boolean checkSort(int arr[], int idx, int size) {
        // base case
        if (size == 0 || size == 1) {
            return true;
        }
        if (arr[idx] > arr[idx+1]) {
            return false;
        } else {

            boolean ans = checkSort(arr, idx + 1, size - 1);
            return ans;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 5, 4, 7, 9 };

        // Scanner sc= new Scanner (System.in);
        // System.out.println("Enter any number: ");
        // int n= sc.nextInt();

         boolean ans =checkSort(arr, 1, 4);

        if (ans)
        {
            System.out.println(" sorted");
        }
        else{
            System.out.println(" not sorted");
        }
    }
}
