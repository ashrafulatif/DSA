import java.util.*;

public class reverseQueue {
    
    public static void reverse(Queue<Integer> q){

        Stack<Integer> s = new Stack<>();
        int size = q.size();

        for (int i=0; i <size; i++){
            s.push(q.remove());
        }
        while (!s.isEmpty()){
             //remove from stack and push back to queue
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i=1; i <=5; i++){
            q.add(i);
        }
   
        reverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
}
