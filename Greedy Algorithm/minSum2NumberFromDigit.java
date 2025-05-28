import java.util.Arrays;

public class minSum2NumberFromDigit {
    

    public static void main(String[] args) {
        
        int arr[] = {5,3,0,7,4};

        String num1 = "", num2 ="";

        //sort
        Arrays.sort(arr);

        for (int i =0; i<arr.length; i++){

            if(i%2==0){     //even index
                String cur1 = Integer.toString(arr[i]);
                num1 +=cur1;
            }
            else{         //odd index
                String cur2 = Integer.toString(arr[i]);
                num2+=cur2;
            }
        }

        int result = Integer.parseInt(num1)+Integer.parseInt(num2);

        System.out.println("total number" +num1+" "+ num2 +": "+result);
    }
}
