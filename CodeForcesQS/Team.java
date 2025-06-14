import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    int arr[][] = new int[t][3];

    while (t -->0) {
        
        for (int i = 0; i < 3; i++) {
            arr[t][i] = sc.nextInt();
        }
    }

    int count =0;
    for (int i =0; i<arr.length; i++){

        int temp =0;
        for (int j =0 ; j< 3; j++){
            if (arr[i][j] == 1){
                temp++;
            }
            if(temp == 2){
                count++;
                temp= 0;
            }
        }
    }

    System.out.println(count);
}
}