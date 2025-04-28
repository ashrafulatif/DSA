import java.util.Stack;

public class nextGreaterElement {

    public static void main(String[] args) {

        int arr[] = new int[] { 6, 8, 2, 7, 1 };
        int nxtGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        // for loop will go every element backward
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) // while will check and pop from the stack if stack top is
                                                            // less then current value(idx)
            {
                s.pop();
            }
            
            if (s.isEmpty()) // if ther is no value
            {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i);

        }
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
    }

    // similar question base on same logic

    // 1> next greater right
    // 1> next greater Left : samecode. for loop will not be reverseq
    // 1> next smaller right : arr[s.peek()] >= arr[i]
    // 1> next smaller left : not reverse for loop and arr[s.peek()] >= arr[i]
}
