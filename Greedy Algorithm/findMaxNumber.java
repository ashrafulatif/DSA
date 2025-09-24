import java.util.Arrays;

class findMaxNumber {
    public static String largestNumber(int[] arr) {

        // convert the into str
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        // sort using comparator
        Arrays.sort(strArr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            s.append(strArr[i]);
        }

        // if 0
        if (s.charAt(0) == '0') {
            return "0";
        }

        return s.toString();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2 };

        System.out.println(largestNumber(arr));
    }
}