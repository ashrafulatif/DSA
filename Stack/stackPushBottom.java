import java.util.Stack;

public class stackPushBottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        // BASE CASE
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // RR
        int top = s.pop();
        System.out.println("top value >" + top);
        pushAtBottom(s, data);
        System.out.println("top value after >" + top);
        s.push(top);
        System.out.println("top value after push >" + top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while (!s.isEmpty()) {

            System.err.println(s.pop());
        }

    }

}
