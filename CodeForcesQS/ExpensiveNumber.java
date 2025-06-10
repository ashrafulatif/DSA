import java.util.*;

public class ExpensiveNumber {

    public static void calculateExpensiveNum( String num){

        int zero = 0, nonZero=0, ans=0;
        int last = 0;
        
        if (num.length() == last){
            System.out.println(0);
            return;
        }

        for (int i = num.length()-1; i >= 0; i-- ){

            //count the zero from right
            if(num.charAt(i)=='0'){
                zero++;
            }

            if (num.charAt(i)!= '0'){
                last = i;
                break;
            }
        }

        for (int i = 0; i<last; i++){

            if (num.charAt(i)!= '0'){
                nonZero++;
            }
        }

         ans = nonZero+zero;


        System.out.println(ans);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        
        while(n > 0){
            String num = sc.nextLine();
            calculateExpensiveNum(num);
            n--;
        }
    }
}