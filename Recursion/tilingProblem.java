public class tilingProblem {
    
    public static int tilProblem(int n){
    //n is horizontall size
    
    //base case
    if (n==0 || n==1) return 1;

    //vertical
    int fnm1 = tilProblem(n-1);
    //horizontal tiling 
    int fnm2 = tilProblem(n-2);

    int totalWays  = fnm1+fnm2;

    return totalWays;

    }

    public static void main(String[] args) {
     
        System.out.println(tilProblem(4));
    }
}
