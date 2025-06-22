import java.util.Scanner;

public class AbovetheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); 

        while (t-- > 0) {
           int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
           
            String str1 = "", str2 = "", str3 = "";

            int s = 0, e = str.length() - 1;
            int mid = s + (e - s) / 2;
            str3 += str.charAt(mid);

            for (int i = 0; i < mid; i++) {
                str1 += str.charAt(i);
            }

            for (int i = mid + 1; i <= e; i++) {
                str2 += str.charAt(i);
            }

            String finalStr = str1 + str2;

            boolean found = false;
            for (int i = 0; i < finalStr.length(); i++) {
                if (finalStr.charAt(i) == str3.charAt(0)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
