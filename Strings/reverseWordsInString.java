import java.util.*;
public class reverseWordsInString {
    
    public static String reverseWords(String s) {
        
        StringBuilder sc = new StringBuilder();
        Stack<String> stk = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
           
            if(s.charAt(i) != ' '){
                sc.append(s.charAt(i));
            }else{
                if (sc.length()>0){
                    stk.push(sc.toString());
                    sc.setLength(0);
                }
            }
        }
        if (sc.length()>0){
            stk.push(sc.toString());
        }
        

        while(!stk.isEmpty()){
            ans.append(stk.pop());
            if(!stk.isEmpty()){
                ans.append(' ');
            }
        }
        return ans.toString();
    }
    
    
      public static void main(String[] args) {
         String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    
}


