import java.util.*;

public class LL_collectionFrame {

    public static void main(String[] args) {

        LinkedList <Integer>ll= new LinkedList<Integer>();

        ll.add(10);
        ll.add(20);
        ll.addFirst(5);
        ll.add(1);
        ll.add(2, 15);
        System.out.println(ll);
        
        int sum=0;
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i)+"-> ");
            sum= sum+ll.get(i);
        }
        System.out.println("sum:"+sum);
        System.out.println();
        
        int a = ll.get(0);
        int b = ll.get(2);

        int c=a+b;
        System.out.println(c);

        Collections.sort(ll);

        System.out.println(ll);
        
        
        System.out.println(ll.remove(1));

        System.out.println(ll);
    }    
}
