import java.util.Scanner;

public class SayDigit {

    static void sayDigit(int n, String arr[]) {
        // base case
        if (n == 0) {
            return;
        }

        int digit = n % 10;
        n = n / 10;

        // R.R
        sayDigit(n, arr);

        System.out.println(arr[digit] + " ");

    }

    public static void main(String[] args) {

        String arr[] = { "zero", "one", "two", "three",
                "four", "five", "six", "seven",
                "eight", "nine" };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int i = sc.nextInt();

        sayDigit(i, arr);
    }

}
