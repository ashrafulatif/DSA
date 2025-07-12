import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class derangedDeletions {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            ArrayList<Integer> arr = new ArrayList<>();
            
            //fill the array
            int n = sc.nextInt();
            for (int i =0; i < n; i++){
                arr.add(sc.nextInt());
            }

            if (n<=1){
                System.out.println("NO");
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                ArrayList<Integer> ans = new ArrayList<>();

                for (int i =0; i<arr.size(); i++){
                    temp.add(arr.get(i));
                }
                Collections.sort(temp);

                //if already sorted
                if (arr.equals(temp)){
                    System.out.println("NO");
                }else{

                    for (int i = 0; i<n; i++){
                        if(arr.get(i) != temp.get(i)){
                            ans.add(arr.get(i));
                        }
                    }
                    System.out.println("YES");
                    System.out.println(ans.size());

                    for(int num : ans) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }

            }
            
        }
    }
}
