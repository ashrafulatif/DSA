import java.util.*;

class stackPushBottomWithoutRecur {
    
    public static void pushAtBottom(Stack<Integer> s, int data ){
        
        ArrayList<Integer> arr= new ArrayList<Integer>();
     
       arr.add(data);
        //push into the array
        while (!s.isEmpty()){
               int top = s.pop();
               arr.add(top);
        }
        for (int i =0; i < arr.size(); i++){
            s.push(arr.get(i));
        }
    }
    
    public static void main(String[] args) {
        
        Stack <Integer> s= new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        pushAtBottom (s, 5);
       
        
        
        while (!s.isEmpty()){
             System.out.println(s.pop());
        }
    }
}