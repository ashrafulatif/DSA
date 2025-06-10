import java.util.Scanner;

public class FalseAlarm {

    public static void solver(int n, int x, int arr[]){

        for(int i =0; i<n;i ++){

            if (arr[i]!=0){
                while (x>0) {
                    i++;
                    x--;

                    if(i==arr.length){
                        System.out.println("YES");
                        return;
                    }
                }
            }

            if (arr[i] !=0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        while (testCase>0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int arr[] = new int[n];

            for (int i =0; i<n; i++){
                int num = sc.nextInt();
                arr[i] = num;
            }

            solver(n, x, arr);
            testCase--;
        }
    }
}
