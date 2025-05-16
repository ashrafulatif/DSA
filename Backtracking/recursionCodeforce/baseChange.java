
import java.util.*;
public class baseChange {
     public static void baseChangeBinary (int n){
        //base case
        if (n<=0){
            return;
        }
        //convert
        int rem = n/2;
        baseChangeBinary (rem);
        System.out.print (n%2);
        
         
    }
    
    public static void main(String[] args) {
       
       Scanner sc = new Scanner (System.in);
       int T =sc.nextInt();
       
      while (T-->0){
          int n =sc.nextInt();
          baseChangeBinary(n);
          System.out.println();
      }

    }
}


    
   
}