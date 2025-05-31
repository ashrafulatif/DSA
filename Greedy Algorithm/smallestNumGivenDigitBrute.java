
public class smallestNumGivenDigitBrute {
    
    
    public static String findSmallSum(int s, int d){
        
        int start = (int) Math.pow(10, d-1);
        int end = (int) Math.pow(10,d);
        
        for (int i = start; i< end; i++){
            
            int x = i, sum =0;
            
            //extract the digit
            while (x >0){
                sum += x%10;
                x = x/10;
            }
            
            if (sum == s){
                return Integer.toString(i);
            }
        }
       
       return "-1";
    }
    
    public static void main(String[] args) {
        
        System.out.println(findSmallSum(9,2));
    }
}
