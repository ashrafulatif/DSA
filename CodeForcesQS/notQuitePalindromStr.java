import java.util.*;
public class notQuitePalindromStr {

    public static String isGoodpair(int n, int k, String str){
        //find the 0 and 1
       int c1=0, c0=0; 
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='0') c0++;
            else c1++;
        }

        int diff = Math.abs(c0-c1)/2;
        if(k<diff) return "NO";
        else if((k-diff)%2 ==0) return "YES";
        else return "NO";
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        long t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine(); 

            String str = sc.nextLine();

            System.out.println(isGoodpair(n, k, str));
        }
    }
}