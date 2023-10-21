public class Palindrom {

    static boolean CheckPalindrom(String str, int i, int j) {
        // base case
        if (i > j) {
            return true;
        }
        if (str.charAt(i) != str.charAt(j)) {

            return false;
        } else
            return CheckPalindrom(str, i+1, j-1);
    }

    public static void main(String[] args) {

        String str = "atef" ;

        boolean ans = CheckPalindrom(str, 0, str.length() - 1);

        if (ans) {
            System.out.println("Palindrom ");
        } else {
            System.out.println("Not Palindrom ");
        }

    }

}
