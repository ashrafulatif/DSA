import java.util.ArrayList;
import java.util.List;

public class permutation {
    
    public static void solve(int num[],List<List<Integer>> ans, int index ) 
    {
        //base case 
        if(index>=num.length)
        {
            ArrayList<Integer> l= new ArrayList<>();
            for (int x:num)
            {
                l.add(x);
            }
            ans.add(l);
            return;
        }
        for (int j = index; j<num.length;j++)
        {
            int temp= num[index]; // for swap
            num[index]=num[j];
            num[j]= temp;
            solve(num, ans, index+1);

            temp=num[index]; //for backtrack
            num[index]=num[j];
            num[j]=temp;
        }
    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans= new ArrayList<>();
        int index=0;
        solve(nums, ans, index);
        return ans;
    }
    public static void main(String[] args) {
        
        int num[]= new int[]{1,2,3};
        System.out.println(permute(num));
    }
}
