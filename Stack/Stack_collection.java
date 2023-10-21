import java.util.*;
public class Stack_collection {

    public void print(Stack<Integer> s)
    {
        for(int i=0 ; i<s.size();i++)
        {
            System.out.println(s.get(i));
        }
    }

    public static void main(String[] args) {
        
        Stack_collection sc=new Stack_collection();
        Stack<Integer> s= new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        sc.print(s);
        
    
    }
    
}
