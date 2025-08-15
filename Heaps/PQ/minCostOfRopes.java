import java.util.PriorityQueue;

public class minCostOfRopes {

    public static void main(String[] args) {
        
        int ropes [] = {2,3,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //add to priority queue
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        //find the cost 
        int cost =0;
        while (pq.size() > 1) {
            //remove first 2 min el
            int min = pq.remove();
            int min2 = pq.remove();

            cost+= min+min2;
            
            //add the new cost to pq
            pq.add(min+min2);
        }
        
        System.out.println("min cost to connecting the rope: "+ cost);
    }
}