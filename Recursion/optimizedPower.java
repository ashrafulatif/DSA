public class optimizedPower {
    public static int optimizePower (int x, int n ){
        //base case 
        if (n==0) return 1;
        
       int halfPower = optimizePower(x, n/2) ;
       int halfPowerSqr = halfPower *halfPower;
       
       //for odd
       if (n%2!=0){
          halfPowerSqr= x*halfPowerSqr;
       }
       
       return halfPowerSqr;
        }
       
        
        public static void main(String[] args) {
            
            System.out.println(optimizePower(2,10));
        }
}
