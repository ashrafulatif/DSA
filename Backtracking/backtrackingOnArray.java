

public class backtrackingOnArray {

    public static void backtrackinOnArray(int arr[], int i, int val){

        if (arr.length ==i ){
            printArr(arr);
            return;
        }
        arr[i] = val;
        //recursion call
        backtrackinOnArray(arr, i+1, val+1);
        //minus -2 while returning
        arr[i] = arr[i]-2; //backtrackingh step
    }

    public static void printArr(int arr[]) {
        for (int i =0; i < arr.length; i ++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        int arr[] = new int[5];
        backtrackinOnArray(arr, 0, 1);
        printArr(arr);
    }
    
}