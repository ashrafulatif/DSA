import java.util.Scanner;

public class blackBoardGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); 

            if (n % 4 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }

        sc.close();
    }
}
