import java.util.*;
class genBinaryFrom1toN {
    
    public static void genBin(int n ){
        
        Queue<String> q = new LinkedList<>();
        
        q.add("1");
        
        for (int i =1; i<=n; i++){
            
            String s = q.remove();
        
            System.out.println(s);
            
            q.add(s+"0");
            q.add(s+"1");
        }
        
        
    }
    
    public static void main(String[] args) {
        genBin(5);
        
    }
}