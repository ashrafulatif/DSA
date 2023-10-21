import java.util.ArrayList;
import java.util.List;

public class keypad {
    
    static void solve(String digits,String output, int index,List <String> ans,String map[])
    {
        // base case 
        if (index>= digits.length())
        {
            ans.add(output);
            return;
        }
        // convert 1st char to int
        int number = Integer.parseInt(String.valueOf(digits.charAt(index)));
        String value= map[number];      // get respective mapping

        for(int i=0;i <value.length();i++)
        {
            String newCur=output+value.charAt(i);
            solve(digits, newCur, index+1, ans, map);
       
        }
    }

    public static List<String> letterCombinations(String digits) {

        List<String> ans =new ArrayList<>();
        String output ="";
        int index=0;
        String map[]= new String[] {"", "", "abc", "def", "ghi", "jkl","mno","pqrs","tuv","wxyz"}; 
        solve(digits,output, index, ans, map);

        return ans;

    }
    public static void main(String[] args) {
        
        String digits="23";
        System.out.print(letterCombinations(digits));
       
    }
}
