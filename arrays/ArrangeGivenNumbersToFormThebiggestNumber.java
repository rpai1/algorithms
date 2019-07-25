package arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 * @author rashmi on 2019-07-01

 */
public class ArrangeGivenNumbersToFormThebiggestNumber {
    public static void main(String[] args) {
        Vector<String> arr;
        arr = new Vector<>();
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);
    }

    private static void printLargest(Vector<String> arr) {
        Collections.sort(arr, new Comparator<String>() {
            public int compare(String x, String y) {
                String xy = x+y;
                String yx = y+x;
               return xy.compareTo(yx)>0 ? -1 : 1;
            }
        });

        for (String s : arr) {
            System.out.print(s);
        }
    }

}
