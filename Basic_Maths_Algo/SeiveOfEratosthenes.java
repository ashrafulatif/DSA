import java.util.Scanner;

public class SeiveOfEratosthenes {

    // create a bool array
    // intialize all element to false, false means the number is prime
    // time complexity: O(n*log(logn))

    static void seive(int n) {
        boolean prime[] = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            if (prime[i] == false) {
                for (int j = i * i; j <= n; j += i) {
                    // make all the multiple true which mean not prime
                    prime[j] = true;
                }
            }
        }

        // if false then print the index
        for (int i = 2; i <= n; i++) {

            if (prime[i] == false)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(" Enter number: ");
        int n = s.nextInt();
        seive(n);
    }

}