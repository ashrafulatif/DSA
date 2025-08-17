import java.util.Stack;

public class pattern132Problem {

    public static boolean find132pattern(int[] nums) {

        int findValK = Integer.MIN_VALUE;

        Stack<Integer> stk = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] < findValK)
                return true;

            while (!stk.isEmpty() && stk.peek() < nums[i]) {
                findValK = stk.pop();
            }
            stk.push(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {  3, 1, 4, 2 };
        System.out.println(find132pattern(arr));
    }
}
