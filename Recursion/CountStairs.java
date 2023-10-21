import java.util.Scanner;

public class CountStairs {

    static int stairs(int n) {
        // base case
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return stairs(n - 1) + stairs(n - 2);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int i = sc.nextInt();
        System.out.println(stairs(i));
    }
}
