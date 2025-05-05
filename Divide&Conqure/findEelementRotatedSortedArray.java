
public class findEelementRotatedSortedArray {
    
    public static int Search (int arr[], int target, int s, int e){
        
        int mid = s+(e-s)/2;
        //base case
        if (s>e){
            return -1;
        }
        //found
        if (arr[mid]== target){
            return mid;
        }
        
        //mid Line 1
        if (arr[s]<=arr[mid]){
            //left line 1
            if (arr[s]<=target && arr[mid]>= target){
                return Search (arr, target, s, mid-1);
            }
            else{ //right
                return Search (arr, target, mid+1, e);
            }
        }
        //mid line 2
        else{
            //right Line 2
            if (arr[mid]<=target && target<=arr[e]){
                return Search (arr, target, mid+1, e);
            }
            else
            {
                //left
                return Search (arr, target, s, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int findIdx = Search (arr,target,  0, arr.length-1);
        System.out.println(findIdx);
    }
}
