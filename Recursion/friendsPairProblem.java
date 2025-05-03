public class friendsPairProblem {
    
    public static int friendSPair( int n) {
        //base case
        if(n==1|| n==2){
            return n;
        }
        //single
        int fnm1 = friendSPair(n-1);
        //pair
        int fnm2 = (n-1)* friendSPair(n-2);

        //total ways
        return fnm1+fnm2;

    }
    public static void main(String[] args) {

        System.out.println(friendSPair(3));
    }
}
