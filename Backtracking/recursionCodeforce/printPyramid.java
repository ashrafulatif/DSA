public class printPyramid {
    public static void printPyramid1(int n, int on) {
        
        //base case
        if (n==0){
            return;
        }
       
        printPyramid1(n-1, on);
        
        //space
        for (int s=0; s<on-n;s++){
            System.out.print(" ");
        }
         for (int i =0; i<2*n-1; i ++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPyramid1(3,3);
    }
}
