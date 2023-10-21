public class MddularExp {

    static int FastExp(int x, int n, int m) {
        int res = 1;

        while (n > 0) 
        {
            if (n & 1) 
            {
                res = (res * (x) % m) % m;
            }
            x= ((x)%m * (x)%m)%m;
            n= n>>1;
        }

        return res;
    }

    public static void main(String[] args) {
        
        int x=3, n=1, m=2;

        System.out.println(FastExp(x, n, m));
    }

}
