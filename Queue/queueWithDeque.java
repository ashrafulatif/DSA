

import java.util.*;


public class queueWithDeque {
    static class Queue{
         Deque<Integer> q = new LinkedList<>();

        //push
        public void add(int data){
            q.addLast(data);
        }
        //pop
        public int remove(){
            return q.removeFirst(); 
        }
        //peek
        public int peek(){
            return q.getFirst();
        }
    }



    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
