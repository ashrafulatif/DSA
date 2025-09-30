import java.util.*;

class arrayPartition {
    public static int arrayPairSum(int[] nums) {

        // sort
        Arrays.sort(nums);

        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int minNum = Math.min(nums[i], nums[i + 1]);
            ans += minNum;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2 };
        System.out.println(arrayPairSum(arr));
    }
}