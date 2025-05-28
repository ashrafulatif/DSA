import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class coinChangeProblem {
    
    public static void main(String[] args) {
        
        Integer coin [] = {1,2,5,10,20,50,100,500,2000};
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        //sort the array
        Arrays.sort(coin, Comparator.reverseOrder());

        
        int count =0;
        for (int i =0; i<coin.length; i ++){
            if (coin[i]<=amount){
                while (coin[i]<=amount) {
                    count++;
                    ans.add(coin[i]);
                    //deduce amount
                    amount -= coin[i];
                }
            }
        }
        System.out.println("total note needed: "+count);

        //print ans
        for (int i=0; i< ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
