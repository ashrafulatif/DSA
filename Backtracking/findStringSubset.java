public class findStringSubset {

    public static void findSubset(String str,String ans,int i ) {
        
        //base case
        if(str.length() ==i){

            if (ans.length()==0){
                System.out.println("null");
            }
            else{
                System.err.println(ans);
            }
            return;
        }
        //recursion call
        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);
        //no choice
        findSubset(str, ans, i+1);
    }
    
    public static void main(String[] args) {
        
        String str ="abc";
        findSubset(str, "", 0);
    }
}
