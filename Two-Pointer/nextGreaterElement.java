
public class nextGreaterElement {
    
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        for (int i =0; i < nums1.length; i++){
            int val = nums1[i];
            nums1[i]=-1;
            boolean found = false;

            for (int j =0; j<nums2.length; j++){
                if (val==nums2[j]){
                    found = true;
                }
                if (found && nums2[j]>val){
                    nums1[i]=nums2[j];
                    break;
                }
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        int[] result = nextGreaterElement(nums1, nums2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
