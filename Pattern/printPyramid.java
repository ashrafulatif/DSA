
public class printPyramid {
    
    public static void printPyramid1(int n) {
        
        for (int i=0; i<n; i++){
            //print space
            for (int s=0; s<n-i-1; s++){
                System.out.print (" ");
            }
            //print star
            for (int j =0; j<2*i+1; j++){
                System.out.print ("*");
            }
            System.out.println ();
        }
    }

    public static void main(String[] args) {
        printPyramid1(3);
    }    
}



