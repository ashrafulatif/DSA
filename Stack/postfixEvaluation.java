import java.util.*;

class postfixEvaluation {
    
    public static int EvaluatePostfix(String []arr){
        
        Stack<Integer> s = new Stack<>();
        
        int result =0;
        int top =0;
        
        for (int i =0; i<arr.length; i ++){
            
            if (!arr[i].equals("+") && !arr[i].equals("*")&& 
           !arr[i].equals("/") && !arr[i].equals("-")){
                
                s.push(Integer.parseInt(arr[i]));
            }
            
            if (arr[i].equals("+") || arr[i].equals("*")|| 
                arr[i].equals("/") || arr[i].equals("-")) {
                
                int size =s.size();
                
                for (int j =0; j<size; j++){

                    if (arr[i].equals("+")){
                        result= result+s.peek();
                        s.pop();
                    }
                    else if (arr[i].equals("-")){
                        result= result-s.peek();
                        s.pop();
                    }
                    else if (arr[i].equals("*")){
                        result= result*s.peek();
                        s.pop();
                    }
                    else if (arr[i].equals("/")){
                        result= result/s.peek();
                        s.pop();
                    }
                }
            }
            
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        String arr[] = {"100","200","+","2","/","5","*","7","+"};

        System.out.println(EvaluatePostfix( arr));
    }
}