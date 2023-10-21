import java.lang.*;
// import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // add element to the array list
        list.add(7);
        list.add(3);
        list.add(5);

        System.out.println(list);

        // get element, get element uses the index number

        int element = list.get(1);
        System.out.println(element);

        // add element in between

        list.add(1, 9); // here first number is index and the 2nd number is element
        System.out.println(list);

        // set element (change the existing element)

        list.set(0, 2);
        System.out.println(list);

        // delete element

        list.remove(0);
        System.out.println(list);

        // to know the array list size

        System.out.println(list.size());

        // loops

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting

        Collections.sort(list);
        System.out.println(list);
    }
}
