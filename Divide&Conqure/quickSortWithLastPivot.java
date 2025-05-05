public class quickSortWithLastPivot {
    
    public static void quickSort (int[] arr, int s, int e){
        
        //base case 
        if (s>=e){
            return;
        }
        
        int pIdx = partition(arr, s, e);
        //left
        quickSort(arr,s, pIdx-1);
        //right
        quickSort(arr,pIdx+1, e);

    }
    
    public static int partition (int arr[], int s, int e){
        
        int pivot = arr[e];
        int i = s-1; //make the place for smaller than the pivot
        
        for (int j=s; j<e; j ++){
            
            if (arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
         //for pivot right position
            i++;
            int temp = pivot;
            arr[e] = arr[i];
            arr[i] = temp;
            
        return i;
    }
    
    //print the sorted arry
    public static void printArray(int[] arr){
        
        for (int i =0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        
        int arr[] = {3,4,1,4,6,7};
        quickSort(arr,0, arr.length-1);
        
        printArray(arr);
    }
}



