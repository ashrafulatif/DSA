import java.util.*;
public class permuteNumber {
    public static void solver (int []nums, List<List<Integer>> ans, int idx){
        
        if (idx>=nums.length){
            
            List <Integer> tempArr = new ArrayList<>();
            for (int num:nums){
                tempArr.add(num);
            }
            ans.add(tempArr);
            
            return;
        }
        
        for (int i =idx;i<nums.length; i ++){
            
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
            
            solver(nums, ans, idx+1);
            
            //backtrack
             temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
            
        }
        
    }
    
    public static List<List<Integer>> permute(int nums[]){
      
      List<List <Integer>> ans = new ArrayList<>();
      int idx =0;
      solver(nums, ans, idx);
      
      return ans;
    } 
    
    
    public static void main(String[] args) {
        int arr[] = {1,2,3};
       
        System.out.print(permute(arr));
    }
}


