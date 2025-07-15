
import java.util.*;

public class palindromReplace {

    public static int isPalindrom(String str) {
        StringBuilder temp = new StringBuilder(str);

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (temp.charAt(i) == '?' && temp.charAt(j) != '?') {
                temp.setCharAt(i, temp.charAt(j));
            } else if (temp.charAt(j) == '?' && temp.charAt(i) != '?') {
                temp.setCharAt(j, temp.charAt(i));
            } else if (temp.charAt(i) == '?' && temp.charAt(j) == '?') {
                temp.setCharAt(i, 'a');
                temp.setCharAt(j, 'a');
            } else if (temp.charAt(i) != temp.charAt(j)) {
                System.out.println("-1");
                return -1;
            }

            i++;
            j--;
        }

        if (str.length() % 2 == 1 && temp.charAt(str.length() / 2) == '?') {
            temp.setCharAt(str.length() / 2, '0');
        }

        System.out.print(temp.toString());
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        isPalindrom(str);
    }
}
