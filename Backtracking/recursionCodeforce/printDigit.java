import java.util.*;
public class printDigit {
     
     public static void printStr(int arr[], int idx){
          //base case
          if (arr.length<=idx){
              return;
          }
          
          //convert number
          String number = String.valueOf(arr[idx]);
          
          for (int i =0; i< number.length(); i ++){
            
           int j = Character.digit(number.charAt(i), 10);
           
           System.out.print(j);
           if (i<number.length()-1){
                System.out.print(" ");
           }
          }
          System.out.println();
          //recursion call
          printStr(arr, idx+1);
     }
     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int arr [] = new int [loop];
        
        for (int i =0; i<loop; i ++){
            int n = sc.nextInt();
            arr[i] =n;
        }
        
        printStr(arr, 0);
    }
}

    

