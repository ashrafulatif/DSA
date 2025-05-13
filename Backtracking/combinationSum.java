 
import java.util.*;

public class combinationSum {
    
    public static void solver (int []nums, int index, ArrayList <Integer> output, List<List<Integer>> ans , int target){
        //base case 
        if (target==0){
            ans.add (new ArrayList<>(output));
            return;
        }
        if (nums.length ==index || target<0){
            return;
        }
        
        //single choice
        output.add (nums[index]);
        solver(nums, index, output, ans, target-nums[index]);
        output.remove (output.size()-1); 
        //exclude
        solver(nums, index+1, output, ans, target);
    }
    
   public static List<List<Integer>> subsets(int[] nums, int target) {
       
       int index =0;
       ArrayList<Integer> output= new ArrayList<>();
       List<List<Integer>> ans = new ArrayList<>();
       solver (nums, index, output, ans, target);
       return ans;
   }
    
    
    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
       
        System.out.print( subsets(arr, target));
    }
} 

