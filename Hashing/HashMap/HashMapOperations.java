import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Bangladesh", 10000);
        hm.put("USA", 111000);
        hm.put("Japan", 19900);
        hm.put("Uk", 3000);

        System.out.println(hm);
        int population = hm.get("Bangladesh");
        System.out.println(population);

        // if no key exist -> return null
        System.out.println(hm.get("Indonesia"));

        // contains key -> return true/false
        System.out.println(hm.containsKey("China"));

        // remove return value after remove

        // if no found -> return nulls
        System.out.println(hm.remove("China"));

        System.out.println(hm.isEmpty());

    }
}
