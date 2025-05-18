import java.util.*;
public class printNonRepeatingLetter {
    
    public static void printNonRepeat(String str){
        int freq[] = new int[26];
        Queue <Character> q = new LinkedList<>();
        
        for (int i =0;i< str.length(); i++){
            //extract char and add to queue
            char ch = str.charAt(i);
            q.add(ch);
             
            //update the freq arry
            freq [ch-'a']++;

            //remove the char if freq more then 1
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }

            if (q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";

        printNonRepeat(str);
    }
}
