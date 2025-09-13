import java.util.*;
class IntersectionOfTwoArr2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort (nums1);
        Arrays.sort(nums2);
        
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int ansSize = nums1Len > nums2Len ? nums1Len : nums2Len;
       
        int ans[] = new int[ansSize];

        int i=0,j =0, k=0; 
        while(i<nums1Len && j<nums2Len){
            if(nums1[i] == nums2[j]){
                ans[k] = nums1[i];
                i++;
                j++;
                k++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        return ans;
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
