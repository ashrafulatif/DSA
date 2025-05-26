import java.util.*;
public class activitySelection {

    public static void main(String[] args) {
        int start [] ={1,3,0,5,8,5};
        int end [] ={2,4,6,7,9,9};
        ArrayList<Integer> ans = new ArrayList<>();
        
        //store the first index & ans
        int count=1;
        ans.add(0);
        int lastEnd = end[0];

        for (int i =1; i<start.length; i++){
            //count update
            if (start[i]>=lastEnd){
                count=count+1;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println(count);
        for (int i=0; i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
