public class GCD {

    public static int gcd(int a, int b) {
        if (a == 0) 
        {
            return b;
        } 
        else if(b==0)
        {
            return a;
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }
    public static void main(String[] args) {
        

        int a=72, b=24;
        System.out.println(gcd(a,b));

    }
}
