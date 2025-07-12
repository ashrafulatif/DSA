import java.util.*;
public class downWithBrackets {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-->0) {
            String str = sc.nextLine();
            Stack <Character> s = new Stack<>();

            int seq=0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                //coutn seq
                if(s.isEmpty()){
                    seq++;
                     s.push(ch);
                }else if (ch == '('){
                    s.push(ch);
                }else{
                    s.pop();
                }
            }

            if (seq>1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}

