import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class kTopElements {
    public static int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[k];

        //count the freq
        for (int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        //convert map entries to list
        List<Map.Entry<Integer, Integer>>entryList = new ArrayList<>(map.entrySet());
        System.out.println(entryList);

        //sort the entryList
        entryList.sort((a,b) -> b.getValue() - a.getValue());
        System.out.println(entryList);

        for (int i = 0; i < k; i++) {
            ans[i] = entryList.get(i).getKey();
        }
       
       return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,-1,2,-1,2,3};
        int k =2;
        int ans[] = topKFrequent(arr,k);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}