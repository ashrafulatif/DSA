import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Subset {

    public static List<List<Integer>> subsets(int num[]) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output= new ArrayList<>();
        int index = 0;
        solve(num, output, index, ans);
        return ans;
    }

    static void solve(int num[], ArrayList<Integer> output, int index, List<List<Integer>> ans)
    {
        // base case 
        if (index>=num.length)
        {
            ans.add(new ArrayList<>(output));
            return;
        }
        // exclude 
        solve (num, output, index+1, ans);

        // include 

        int element= num[index];
        output.add(element);
        solve(num, output, index+1, ans);
        System.out.print(output.remove(output.size()-1));
    }

    public static void main(String[] args) {

        int num[] = new int[] { 1, 2 };
        System.out.println(subsets(num));
    }
}