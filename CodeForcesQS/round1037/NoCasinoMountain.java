import java.util.Arrays;
import java.util.Scanner;

public class NoCasinoMountain {
    public static int solver(int arr[], int k){

        
        int ans =0;
        int n = arr.length;
        int i =0;
        while (i+k<= n) {
            boolean canHike = true;
            for (int j = i; j < i+k; j++) {
                if (arr[j]==1){
                    canHike= false;
                    break;
                }
            }

            if(canHike){
                ans++;
                //skip hiking day+1 day
                i += k + 1;
            }else{
                    i++;
            }
            }
            return ans;
        }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(solver(arr,k));
        }
    }      
}
