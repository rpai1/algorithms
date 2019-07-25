package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author rashmi on 2019-07-03

 */
public class SortArrayBasedOnAbsoluteDifference {
    public static void main(String[] args) {
        Integer arr[] = {10, 5, 3, 9 ,2};
        int x = 7;
        sortArrayBasedOnAbsoluteDifefrenceWithX(arr, arr.length, x);
    }

    private static void sortArrayBasedOnAbsoluteDifefrenceWithX(Integer[] a, int n, int x) {

       Arrays.sort(a, new Comparator<Integer>(){

           @Override
           public int compare(Integer o1, Integer o2) {
               return Math.abs(x-o1) - Math.abs(x-o2);
           }
       });

        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
