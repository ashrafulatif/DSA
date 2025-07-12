import java.util.*;
public class AbovetheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            Map<Character, Integer> mp = new HashMap<>();
            
            for (int i=0; i<n; i++){
                char ch = str.charAt(i);
                mp.put(ch, mp.getOrDefault(ch,0)+1);
            }
            
            boolean found =false;
            for (int i=1 ; i< n-1; i++){
                char ch = str.charAt(i);

                mp.put(ch, mp.get(ch) - 1);
                if (mp.get(ch) == 0) {
                    mp.remove(ch);
                }
                
                if(mp.containsKey(ch)){
                    found = true;
                    break;
                }
                mp.put(ch, mp.getOrDefault(ch, 0)+1);
            }
            
            System.out.println(found ? "Yes": "No");
        }
    }
    
    
    
}