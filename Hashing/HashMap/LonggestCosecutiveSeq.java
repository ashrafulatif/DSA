import java.util.Arrays;
import java.util.HashMap;

public class LonggestCosecutiveSeq {
    
    public static int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int cur =1, ans =1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]+1){
                cur++;
                ans = Math.max(ans, cur);
            }else if (nums[i] != nums[i-1]){
                cur=1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={100,4,200,1,3,2};

        System.out.println(longestConsecutive(arr));
    }
}
