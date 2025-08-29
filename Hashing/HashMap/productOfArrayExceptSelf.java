import java.util.HashMap;

public class productOfArrayExceptSelf {
    
    //O(n^2) approach
    public static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        int k =0;
        int mul =1;
        while (k<nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if(k == i){
                    continue;
                }
                else{
                    mul = mul*nums[i];
                }
            }
            ans[k] = mul;
            mul =1;
            k++;
        }
        return ans;
    }

    //O(n)
    public static int[] productExceptSelf2(int[] nums) {
        int ans[] = new int[nums.length];
        
        //cal prefix
         ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i-1] * ans[i-1];
        }
        //multiply with suffix products
        int suffix = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            ans[i] = suffix * ans[i];

            //update the suffix
            suffix = suffix * nums[i];
        }

        return ans;
    }
        
    public static void main(String[] args) {
        
        int arr[] ={1,2,3,4};

        int ans[] = productExceptSelf(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
