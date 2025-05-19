import java.util.*;
class reverseKelementOfQueue {
    
    public static Queue<Integer> reverse( Queue<Integer> q, int k ){
        
        Queue<Integer> ans = new LinkedList<>();
        Stack <Integer> s = new Stack<>();
        
        int size = q.size();
        
        if (k<=size){
            for (int i =0; i<k; i ++){
            s.push(q.remove());
                
            }
            for (int i =0; i<size;i++){
                if (!s.isEmpty()){
                    ans.add(s.pop());
                }
                else{
                    ans.add(q.remove());
                }
            }
        }else{
            return q;
        }
        
     return ans;   
    }
    
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(reverse(q, 3));
        
    }
}