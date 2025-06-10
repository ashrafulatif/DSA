import java.util.*;

public class CoolPartition {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
    
        int testCase = sc.nextInt();
        
        while(testCase --> 0){

            int n = sc.nextInt();
            int arr[] = new int[n]; 

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int lastIdx = 0;
            int segment =1;

            Set<Integer> s = new HashSet<>();
            s.add(arr[0]);

            for(int i =1; i< n; i ++){

                if(s.contains(arr[i])){
                    s.remove(arr[i]);
                }
                if(s.isEmpty()){
                    segment++;

                    for (int j = lastIdx+1; j <=i; j++) {
                        
                        s.add(arr[j]);
                    }
                    lastIdx = i;
                }
                
            }
            System.out.println(segment);
        }

    }   
}
