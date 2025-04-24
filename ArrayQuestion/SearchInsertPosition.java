public class SearchInsertPosition {
    public static int helperFunc(int s, int e, int nums[],int target){
        
        int mid = e+(s-e)/2;
        
        //base case
        if (s>e){
            return s;
        }
        
        if(nums[mid]== target){
            return mid; 
        }
        else if (nums[mid]>target){
            return helperFunc(s, mid-1, nums, target);
        }
        else{
            return helperFunc(mid+1, e, nums, target);
        }
    }
    
    public static int searchInsert(int[] nums, int target) {
        
        int s = 0;
        int e = nums.length-1;
        
         return helperFunc( s,e,nums, target);
    }
    
    public static void main(String[] args) {
        
        int arr[] = {1,3,5,6};
        
        System.out.println(searchInsert(arr,2));
    }
}
