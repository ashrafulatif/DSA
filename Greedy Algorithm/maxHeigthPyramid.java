import java.util.Arrays;

public class maxHeigthPyramid {
    
    public static void main(String[] args) {
        
        int arr[] ={10, 20, 30, 50, 60, 70};

        int count =1;
        //sort
        Arrays.sort(arr);
        int lastEnd = arr[0];
        int elementCount =0;

        for (int i =1; i<arr.length-1; i+=2){
            
            int temp = arr[i] + arr[i+1];

            if (temp>lastEnd && elementCount<=count){
                count ++;
                elementCount++;
                lastEnd = arr[i+1];
            }
        }

        System.out.println(count);

    }
}
