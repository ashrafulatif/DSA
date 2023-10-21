import java.util.*;

class PrimeCount {
    public static int countPrimes(int n) {

        boolean[] primes = new boolean[n + 1];
        int cnt = 0;
       // primes[0] = primes[1] = false;
        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                cnt++;
                for (int j = i * 2; j <= n; j = j + i) {
                    primes[j] = true;

                }
            }
        }
        return cnt;

    }

    public static void main(String[] args) {
        int n = 0;
        System.out.print(countPrimes(n));

    }
}