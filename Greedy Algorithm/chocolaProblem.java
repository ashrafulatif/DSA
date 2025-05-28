import java.util.Arrays;
import java.util.Collections;

public class chocolaProblem {

    public static void main(String[] args) {
        
        int n =4, m=6;
        Integer costHor [] = {4,1,2}; //n-1
        Integer costVer [] ={2,1,3,1,4}; //m-1

        int h=0, v= 0;
        int hp =1, vp=1;
        int totalCost =0;

        //sort the arr
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        while (h<costHor.length && v<costVer.length) {

            if(costHor[h]>=costVer[v]){
                totalCost += costHor[h]*vp;
                hp++;
                h++;
            }
            else{
                totalCost += costVer[v]*hp;
                vp++;
                v++;
            }
        }
        //if element left in arr
        while (h<costHor.length ){
            totalCost += costHor[h]*vp;
            hp++;
            h++;
        }
        while (v<costVer.length) {
            totalCost += costVer[v]*hp;
            vp++;
            v++;
        }

        System.out.println("total cost "+ totalCost);
    }
}
