import java.util.Arrays;

public class minCostAcquireAllCoin {

    public static void main(String[] args) {
        int coin[] = {1, 2, 5, 10, 20, 50};

        Arrays.sort(coin);

        int ans =0;
        int k=3;
        int costIdx =0;

        for (int i =0; i<coin.length; i+=(k+1)){

             ans += coin[costIdx];
             costIdx++;
        }

        System.out.println(ans);
    }
}