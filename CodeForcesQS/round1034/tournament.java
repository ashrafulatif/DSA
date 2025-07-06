import java.util.Scanner;

public class tournament {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();

            int arr[] = new int[n];

            //fill the array
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            //for 0 base indexing
            j--;

            if(k>=2){
                System.out.println("YES");
            }
            else{
                //find the max
                int temp = arr[0];
                for (int i =1; i<n; i++){
                    temp = Math.max(temp, arr[i]);
                }

                if(temp == arr[j]){
                    System.out.println("Yes");
                }else{
                    System.out.println("NO");
                }
            }

        }
    }
}
