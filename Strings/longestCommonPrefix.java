

public class longestCommonPrefix {

    public static String longCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        int len = strs.length;
        int min = 201;

        for (int i = 0; i < len; i++){
            if(min > strs[i].length()){
                min = strs[i].length();
            }
        }

        for (int i =0; i < min; i++){
            char ch = strs[0].charAt(i);

            for (int j = 1; j<strs.length; j++ ){
                if (strs[j].charAt(i)!= ch){
                    return ans.toString();
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        
        System.out.println(longCommonPrefix(strs));
        
    }
}
