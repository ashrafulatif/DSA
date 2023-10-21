import java.util.Scanner;

public class Fibonacci {
    
    public static int fib(int n)
    {
        // base case 
        if (n==0)
        {
            return 0;
        }
        if (n==1)
        {
            return 1;
        }
        // recursive relation 
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter any number: ");
        int i = sc.nextInt();
        System.out.println(fib(i));

    }
}
