import java.util.Scanner;
public class printNumR {

    static void print(int n) {
        if (n == 0) {
            return;
        }
        // recursion relation
        System.out.println(n);

        print(n - 1);
    }

    public static void main(String[] args) {

        System.out.println();
        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();

        print(i);

    }
}
