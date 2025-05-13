import java.util.*;

public class combinationSum2Unique {
    public static void solver (int[] combinations, int idx,List<List<Integer>> ans, 
    ArrayList<Integer> curArr, int target){

        //base case 
        if (target==0){
            ans.add(new ArrayList<>(curArr));
            return;
        }
        if (combinations.length == idx || target<0){
            return;
        }

        //single include
        int curVal = combinations[idx];
        curArr.add(curVal);
        solver (combinations, idx+1, ans, curArr, target-combinations[idx]);
        curArr.remove(curArr.size()-1);

        //skip duplicate
        while (idx+1<combinations.length && combinations[idx]==combinations[idx+1]){
            idx++;
        }
        //exclude
        solver (combinations, idx+1, ans, curArr, target);
        
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curArr= new ArrayList<>();
        int idx =0;

        solver (candidates, idx, ans, curArr, target);

        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        int target = 8;
       
        System.out.print(combinationSum2(arr, target));
    }
}


