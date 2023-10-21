public class Factorial {
    
    public static int fact(int n)
    {
        if (n==0)
        {
            System.out.println("reach the base case:"+n);
            return 1;
        }
        System.out.println(n);

        int fac= n*fact(n-1);
        System.out.println(fac);
        
        return fac;
    }
    public static void main(String[] args) {
        
        int n=fact(4);
        System.out.println(n);

    }
}
