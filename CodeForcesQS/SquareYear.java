import java.util.Scanner;

public class SquareYear {

    public static void solverSquareYear(String year){

        int num1, num2;

        int yearInt = Integer.parseInt(year);
    
        double yearSqt = Math.sqrt(yearInt);

        //corner case
        if (yearSqt % 1 != 0) {
            System.out.println(-1);
            return;
        }
        // retrieve half
        num1 = (int) (yearSqt / 2);
        //2nd part
        num2 = (int)yearSqt - num1;

        System.out.println(num1+" "+num2);

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n>0) {
            String year = sc.nextLine();
            solverSquareYear(year);
            n--;
        }        

    }
}
