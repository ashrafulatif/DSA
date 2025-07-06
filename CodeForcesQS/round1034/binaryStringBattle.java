import java.util.Scanner;

public class binaryStringBattle {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            
            int count1 =0;

            StringBuilder str = new StringBuilder();

            str.append(sc.nextLine());

            for(int i=0; i< n; i++){
                if(str.charAt(i)=='1'){
                    count1++;
                }
            }
            if(2*k>n){
                System.out.println("Alice");
            }
            else{ //2*k<=n

                if(count1<=k){
                    System.out.println("Alice");
                }
                else{
                    System.out.println("Bob");
                }
            }

            
        }
    }
}
