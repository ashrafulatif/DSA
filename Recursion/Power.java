import java.util.Scanner;

public class Power {

    public static int  power (int n)
    {
        // base 
        if (n==0)
        return 1;

        // Recursive relation
        return 2*power(n-1);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        System.out.println("power:  " + power(n));
    }
}
