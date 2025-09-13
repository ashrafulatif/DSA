public class twoSumWithSortedArr {
    public static int[] twoSum(int[] arr, int target) {
        int i =0, j = arr.length-1;
        int ans[] = new int[2];
        while(i<j){
            if (arr[i] + arr[j] == target){
                ans[0] = i+1;
                ans[1] = j+1;
                break;
                
            }else if(arr[i] + arr[j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int arr[] = {0,-1};
        twoSum(arr, -1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
