import java.util.*;
public class validParentheses {
    
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i =0; i < str.length(); i++){

            //check for opening
            char ch = str.charAt(i);

            if(ch=='('|| ch == '{' ||ch =='['){
                s.push(ch);
            }
            else{
                //for closing brackets
                if (s.isEmpty()){
                    return false;
                }
                if ((s.peek()== '('&& ch ==')')  //()
                ||(s.peek()=='{' && ch =='}') //{}
                ||(s.peek()=='[' && ch == ']')) //[]
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }

        }
        //check if the stack is empty 
        if (s.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        
        String str ="[{[]}()";
        System.out.println(isValid(str));
    }
}
