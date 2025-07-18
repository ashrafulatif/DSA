import java.util.Arrays;
import java.util.Scanner;

public class onlyOneDigit {

    public static int solver(int n){

        char[] digits = String.valueOf(n).toCharArray();

        Arrays.sort(digits);

        String sortedString = new String(digits);
        String charAns = String.valueOf(sortedString.charAt(0));
        int ans = Integer.parseInt(charAns);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(solver(n));
        }
    }    
}
