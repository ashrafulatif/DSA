public class gridWays {
    
    public static int countGrid(int i, int j, int n, int m ){

        //base case
        if (n-1 == i && m-1 ==j){ 
            return 1;
        }
        if (n==i || n==j){
            return 0;
        }
        int w1 = countGrid(i+1, j, n, m);
        int w2 =+countGrid(i, j+1, n, m);
        return w1+w2;
    }

    public static void main(String[] args) {
        int n =3,m = 3;
        System.out.println(countGrid(0,0,n, m)); 
    }
}
