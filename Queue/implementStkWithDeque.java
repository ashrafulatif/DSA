import java.util.*;
import java.util.LinkedList;

public class implementStkWithDeque {

    static class Stack{
         Deque<Integer> q = new LinkedList<>();

        //push
        public void push(int data){
            q.addLast(data);
        }
        //pop
        public int pop(){
            return q.removeLast(); 
        }
        //peek
        public int peek(){
            return q.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
