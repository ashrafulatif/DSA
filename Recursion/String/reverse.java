public class reverse {

    static void rReverse(String str[], int i, int j) {
        // base case
        if (i > j) {
            return;
        }

        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;

        // recursive call
        rReverse(str, i, j);

    }

    public static void main(String[] args) {

        String str[] = { "a", "b", "c", "d" };
        rReverse(str, 0, str.length - 1);
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }

    }
}
