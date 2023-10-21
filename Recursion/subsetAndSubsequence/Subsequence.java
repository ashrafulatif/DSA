import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    public static void solve(String str, String output, int idx, ArrayList<String> ans) {
        // base case
        if (idx >= str.length()) {
            if (output.length() > 0) {
                ans.add(new String(output));
            }
            return;
        }
        // exclude
        output = output.substring(0, output.length());
        solve(str, output, idx + 1, ans);

        // include
        output += str.substring(idx, idx + 1);
        solve(str, output, idx + 1, ans);

    }

    public static ArrayList<String> subsequence(String str) {
        ArrayList<String> ans = new ArrayList<String>();
        String output = new String("");
        int idx = 0;
        solve(str, output, idx, ans);

        return ans;
    }

    public static void main(String[] args) {

        String str = "abc";
        System.out.println(subsequence(str));
    }
}
