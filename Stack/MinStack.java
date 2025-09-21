import java.util.*;

public class MinStack {

    // O(1) approach
    public class MinStack_1 {
        private Stack<Integer> stack;
        private Stack<Integer> minStk;

        public MinStack_1() {
            stack = new Stack<>();
            minStk = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (minStk.isEmpty() || val <= minStk.peek()) {
                minStk.push(val);
            }
        }

        public void pop() {
            int top = stack.pop();
            if (top == minStk.peek()) {
                minStk.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStk.peek();
        }

    }

    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Stack<Integer> temp = new Stack<>();

        int mini = stack.peek();

        while (!stack.isEmpty()) {
            mini = (Math.min(mini, stack.peek()));
            temp.push(stack.pop());
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return mini;
    }

    public static void main(String[] args) {

        
        MinStack outer = new MinStack();
        MinStack.MinStack_1 minStack = outer.new MinStack_1();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // -3
        minStack.pop();
        System.out.println(minStack.top()); // 0
        System.out.println(minStack.getMin()); // -2
    }

}
