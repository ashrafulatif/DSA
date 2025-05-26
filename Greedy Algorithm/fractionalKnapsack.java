import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {

    public static void main(String[] args) {
        
        int value[] ={60,100,120};
        int weigth[] ={10,20,30};
        int w = 50;

        double ratio[][] = new double[value.length][2];

        //sorting
        for (int i=0; i<value.length; i++){
            ratio[i][0] = i;
            ratio [i][1] = value[i]/(double)(weigth[i]); 
        }

        //sort
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int capacity = w;
        int finalVal= 0;

        //loop in deces
        for (int i = ratio.length-1; i >=0; i --){
            //ratio index
            int idx = (int)ratio[i][0];

            if (capacity>= weigth[idx]){        //include full value
                capacity = capacity-weigth[idx];  
                finalVal = finalVal+value[idx];
            }
            else{   //include fraction
                finalVal = finalVal+ (int)(ratio[i][1]*capacity);
            }
        }


        System.out.println("Max Value: "+ finalVal);
    }
}
