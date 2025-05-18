import java.util.*;


public class queueUsing2Stack {
    
    static class Queue{

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        //isEmpty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
    
        //add
        public static void add (int data){
            
            //s1 -> s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);

            //s2 -> s2

            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //remove
        public static int remove (){

            if (s1.isEmpty()){
                return -1;
            }
            return s1.pop();
        }
        //peek
        public static int peek (){

            if (s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        

        Queue q= new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
