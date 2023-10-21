public class seiveOfEratosthenes2 {

    public static int seive(int n) {
        int cnt = 0;
        boolean prime1[] = new boolean[n +1];

        prime1[0] = prime1[1] = true;
        for (int i = 2; i < n; i++) {
            if (prime1[i] == false) {
                cnt++;
                for (int j = 2 * i; j< n; j = j + i) {
                    prime1[j] = true;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        int n = 40;
        System.out.println(seive(n));

    }
}
