import java.util.*;
class IntersectionOfTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> ans = new ArrayList<>();
        
        //comapre two pointer approach
        int i=0, j=0;
        while (i<nums1.length && j< nums2.length){
            if(nums1[i] == nums2[j]){
                //check duplicate
                if(ans.isEmpty() || nums1[i] != ans.get(ans.size()-1)){
                    ans.add(nums1[i]);
                }
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }


        int[] res = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            res[k] = ans.get(k); 
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,1};
        int arr2[]={2,2};

        int ans[] = intersection(arr, arr2);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
