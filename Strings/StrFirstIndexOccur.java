
class StrFirstIndexOccur {
    
    public static int solver (StringBuilder haystack, StringBuilder needle){
        
        int n = haystack.length();
        int m = needle.length();
        
        if (m==0) return 0;
        
        for (int i =0; i<=n-m; i++){
            int j =0;
            while(j<m && haystack.charAt(j+i) == needle.charAt(j)){
                j++;
            }
            if (j==m){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        StringBuilder str1 = new StringBuilder("sadbutsad");
        StringBuilder str2 = new StringBuilder("sad");
        System.out.println(solver(str1, str2));
    }
}