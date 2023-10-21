public class Power {

    static int power(int a, int b) {
        System.out.println(" a:  " + a + "\tb:  " + b);
        // base case
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        // recursive call
        int ans = power(a, b / 2);

        // if b is even
        if (b % 2 == 0) {
            return ans * ans;
        } else {
            return a * ans * ans;
        }
    }

    public static void main(String[] args) {

        int a = 2;
        int b = 10;
        System.out.println("power: " + power(a, b));
    }
}
