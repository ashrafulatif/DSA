import java.util.*;

public class mikeAndPalindrom {

    public static String isPalindrom(String str) {
        
        int i = 0;
        int j = str.length()-1;
        int misMatch = 0;
        
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                misMatch++;
            }
            i++;
            j--;
        }
        
        if(str.length()%2 != 0 && misMatch == 0){
            return "YES";
        }else if (misMatch == 1){
            return "YES";
        }
        return "NO";
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print(isPalindrom(str));
    }
}
