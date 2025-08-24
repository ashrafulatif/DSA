import java.util.HashMap;
import java.util.Set;

public class HashmapIteration {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Bangladesh", 10000);
        hm.put("USA", 111000);
        hm.put("Japan", 19900);
        hm.put("Uk", 3000);

        Set<String> keys = hm.keySet();

        for (String k: keys){
            System.out.println(hm.get(k));
        }
        
        
    }
}
