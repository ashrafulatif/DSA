public class duplicateString {
 
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean[] map ) {
        
        //base case
        if (str.length()==idx ){
            System.out.println(newStr);
            return;
        }
        //check 
        char curChar = str.charAt(idx);
        if (map[curChar-'a']==true){
            removeDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[curChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(curChar), map);
        }

    }
    public static void main(String[] args) {
        String str = "appa";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
