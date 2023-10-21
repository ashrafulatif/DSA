import java.lang.*;
import java.util.*;

public class arraySortMethod {
    public static void main(String[] args) {
        int arr[] = new int[] { 50, 20, 10, 100 };
        System.out.println("Before sorting: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.print("after sorting: " + Arrays.toString(arr));
    }
}
