import java.util.*;


public class smallestNumGivenDigitGreedy {

    public static String findSmallSum(int s, int d){
        
        //edge case 
        if (9*d<s || s<1 ){
            return "-1";
        }
        
        s--;
        
        char result[] = new char[d];
        Arrays.fill (result,'0');
    
        
        //staring from righttmost
        for (int i =d-1; i>0; i--){
            
            if (s>9){
                result[i] = '9';
                s-=9;
            }
            else{
                result[i] = (char)('0'+s);
                s=0;
            }
        }
        
        //leftmost constant
        result[0] = (char)('1'+ s);
     
     return new String(result);
    }
    
    public static void main(String[] args) {
        
        System.out.println(findSmallSum(20,3));
    }
}