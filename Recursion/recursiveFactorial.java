import java.util.Scanner;

class recursiveFactorial
{
    public static int factorial(int n)
    {
        if (n==0) // base case
        {
            return 1;
        }

        // int smallproblem = factorial(n-1);
        // int bigProblem = n*smallproblem;
        // return bigProblem;
        
        //or we can write

        return n*factorial(n-1);
    } 

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n= sc.nextInt();

        System.out.println("Factorial:  "+factorial(n));

    }
}