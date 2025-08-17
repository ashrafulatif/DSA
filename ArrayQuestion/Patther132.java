
public class Patther132 {
    public static boolean find132pattern(int[] nums) {

        int n = nums.length;

        // Check all possible starting positions
        for (int i = 0; i < n - 2; i++) {

            // Check all possible j and k positions after i
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[k] && nums[k] < nums[j]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int nums[] = { 3, 5, 0, 3, 4 };
        System.out.println(find132pattern(nums));
    }
}
