import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImp {

    static class HashMap <K, V>{
        
        private class Node {
        K key;
        V value;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private int n;
    private int N;

    private LinkedList<Node> bucList[];

    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N = 4;
        this.bucList = new LinkedList[4];

        for (int i = 0; i < 4; i++) {
            this.bucList[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key){
        int hc = key.hashCode();
        return Math.abs(hc) % N;
    }
    private int searchInLL(K key,int bi){

        LinkedList<Node> ll = bucList[bi];
        int di = 0;

        for (int i = 0; i < ll.size(); i++) {
            Node node = ll.get(i);
            if (node.key==key){
                return di;
            }
            di++;
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    private void rehash(){
        LinkedList<Node> oldBuck [] = bucList;
        bucList = new LinkedList[N * 2];
        N = 2*N;

        //initialize with empty  linkedlist
        for (int i = 0; i < bucList.length; i++) {
            bucList[i] = new LinkedList<>();
        }

        //node add in the new buc
        for (int i = 0; i < oldBuck.length; i++) {
            LinkedList<Node> ll = oldBuck[i];

            for (int j = 0; j < ll.size(); j++) {
                Node node = ll.remove();
                put(node.key, node.value);
            }
        }
    }

    public void put(K key, V value){
        //find buc index
        int bi = hashFunction(key);
        //find data idx
        int di = searchInLL(key, bi);

        if (di != -1){
            Node node = bucList[bi].get(di);
            node.value = value;
        }else{
            bucList[bi].add(new Node(key, value));
            n++;
        }

        double lambda = (double)n/N;
        if(lambda>2.0){
            rehash();
        }

    }

    public boolean containsKey(K key){
        int bi = hashFunction(key);
        int di = searchInLL(key, bi);

        if (di != -1){
            return true;
        }else{
         return false;   
        }
    }

    public V remove (K key){

        int bi = hashFunction(key);
        int di = searchInLL(key, bi);

        if(di != -1){
            Node node = bucList[bi].remove(di);
            n--;
            return node.value;
        }else{
            return null;
        }
    }
    public V get (K key){

        int bi = hashFunction(key);
        int di = searchInLL(key, bi);

        if(di != -1){
            Node node = bucList[bi].get(di);
            return node.value;
        }
        return null;
    }

    public ArrayList<K> KeySet(){
        ArrayList<K> keys = new ArrayList<>();
        for (int i = 0; i < bucList.length; i++) {
            
            LinkedList<Node> ll = bucList[i];
            
            for (Node node : ll) {
                keys.add(node.key);
            }
        }
        return keys;
    }

    public boolean isEmpty(){
        return n ==0;
    }

}

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