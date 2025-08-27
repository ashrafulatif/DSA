import java.util.*;
class GroupAnagram {

    //sort each string and group them to hashmap
    public List<List<String>> groupAnagrams(String[] strs) {

        ArrayList<List<String>> ans = new ArrayList<>(); 
        HashMap<String, String> map = new HashMap<>();
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];

            char chars[] = s.toCharArray();
            Arrays.sort(chars);

            String sorted = new String(chars);

            map.put(strs[i], sorted);
        }

        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue; 
            ArrayList<String> eachArr = new ArrayList<>();
            eachArr.add(strs[i]);
            used[i] = true;
        
            for (int j = 0; j < strs.length; j++) {
                if ( !used[j] && map.get(strs[i]).equals(map.get(strs[j]))) { 
                    eachArr.add(strs[j]);
                    used[j] = true;
                }
            }
            ans.add(eachArr);
        }

        return ans;
    }
}
