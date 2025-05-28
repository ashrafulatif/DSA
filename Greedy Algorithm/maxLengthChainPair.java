import java.util.Arrays;
import java.util.Comparator;

public class maxLengthChainPair {
    

    public static void main(String[] args) {
        int pair [][] = {{5,24},{39,40},{5,28},{27,40},{50,90}};

        //sort based on 2nd number of pair
        Arrays.sort(pair, Comparator.comparingDouble(o ->o[1]));

        int maxChainLen = 1;
        int lastEnd = pair[0][1];
        for (int i =1; i<pair.length; i++){
            if (pair[i][0]>lastEnd){
                maxChainLen++; 
                lastEnd = pair[i][1];       
            }
        }
        System.out.println("max chain length: "+ maxChainLen );

    }
}
