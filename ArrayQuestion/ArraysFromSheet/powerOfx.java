public class powerOfx {

    public static double myPow(double x, int n) {

        double res = 1.0;
        long power = n;
        
        if(n==0) return 1.0;

        if (n<0){
            x = 1.0/x;
            power = -power;
        }
        while(power>0){
            if(power%2==1){
                res *= x;
            }
            x*=x;
            power /= 2;
        }
        
       return res;
    }

    public static void main(String[] args) {
        int n=2;
        double x= 2.0;

        System.out.println(myPow(x, n));
    }
    
}
