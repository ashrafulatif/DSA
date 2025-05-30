public class EgyptianFraction {

    public static void main(String[] args) {
        
        int numerator = 6;
        int denominator = 14;

        //d>n find the ceiling
        while (numerator != 0){

            //find 1/x
            int x = (int)Math.ceil((double)denominator/numerator);
            System.out.println("1/"+x);

            //update n and d

            numerator = numerator*x -denominator;
            denominator = denominator*x;
        }
    }
}