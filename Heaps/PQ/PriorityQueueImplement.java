import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImplement{
    public static void main(String[] args) {
        
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        //if want to set priorty to higer to lower
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);
        pq.add(1);
        pq.add(7);
        pq.add(2);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
