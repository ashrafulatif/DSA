
public class permutation {

    public static void findPermutation(String str,String ans) {
        
        //base case
        if (str.length()==0){
            System.out.println(ans);
            return;
        }

        //recur call
        for (int i =0; i< str.length(); i++){

            char curChar = str.charAt(i);
            //example abced => ab + ed
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newStr, ans+curChar);
        }
    }
    
    public static void main(String[] args) {
        String str = "abc";
        findPermutation (str, "");
    }
}
