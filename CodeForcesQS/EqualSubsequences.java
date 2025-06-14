import java.util.Scanner;

public class EqualSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            StringBuilder ans = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0 && k > 0) {
                    ans.append('1');
                    k--;
                } else {
                    ans.append('0');
                }
            }
            int idx = 0;
            while (k > 0 && idx < n) {
                if (ans.charAt(idx) == '0') {
                    ans.setCharAt(idx, '1');
                    k--;
                }
                idx++;
            }
            
            System.out.println(ans.toString());
        }
    }
}