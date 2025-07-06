import java.util.Scanner;

public class prefixMinSuffixMax {

    public static String solver(int n, int arr[]){

        StringBuilder ans = new StringBuilder();
        int sufMax[] = new int[n];
        int preMin[] = new int[n];

        //suf max
        sufMax[n-1] = arr[n-1];
        preMin[0] = arr[0]; 

        //prefix
        for(int i=1; i<n; i++){
            preMin[i] = Math.min(preMin[i-1], arr[i]);
        }
        //suffix
        for(int i = n-2; i>=0; i--){
            sufMax[i] = Math.max(sufMax[i+1], arr[i]);
        }

        for(int i =0; i< n; i++){
            if(sufMax[i]>arr[i] && preMin[i]<arr[i]){
                ans.append('0');
            }else{
                ans.append('1');
            }
        }
        return ans.toString();
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {

            int n = sc.nextInt();

            int arr[] = new int[n];
            //fill the arr
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            System.out.println(solver(n, arr));
        }
    }
}
