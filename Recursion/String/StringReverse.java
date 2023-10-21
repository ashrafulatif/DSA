public class StringReverse {

    static void reverse(String str) {

        System.out.print("Call receive for: "+str);
        System.out.println();

        if (str == null || (str.length() <= 1)) {
            System.out.print(str);
        }

        else {
            //System.out.println("");
            System.out.print(str.charAt(str.length() - 1) + " ");
           reverse(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {

        String str = "abcde";
        System.out.println("The given string: " + str);
        reverse(str);
    }
}
