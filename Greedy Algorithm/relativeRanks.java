import java.util.Arrays;
import java.util.HashMap;

class relativeRanks {

    public static void helper(HashMap<Integer, Integer> map, int score[]) {

        int temp[] = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            temp[i] = score[i];
        }

        Arrays.sort(temp);
        int pos = 1;
        for (int i = temp.length - 1; i >= 0; i--) {
            map.put(temp[i], pos);
            pos++;
        }

    }

    public static String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] ans = new String[score.length];

        helper(map, score);

        for (int i = 0; i < score.length; i++) {
            if (map.get(score[i]) == 1) {
                ans[i] = "Gold Medal";
            } else if (map.get(score[i]) == 2) {
                ans[i] = "Silver Medal";
            } else if (map.get(score[i]) == 3) {
                ans[i] = "Bronze Medal";
            } else {
                String temp = String.valueOf(map.get(score[i]));
                ans[i] = temp;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 3, 8, 9, 4 };
        String[] ranks = findRelativeRanks(arr);
        System.out.println(Arrays.toString(ranks));
    }
}

// sort arr
// store pos to map
// iterate arr and find val from map
// store it the new arr