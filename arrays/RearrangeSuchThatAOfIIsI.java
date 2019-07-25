package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rashmi on 2019-07-01

 */
public class RearrangeSuchThatAOfIIsI {

    public static void main(String[] args) {
        int[] a= {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        reArrangeExtraSpace(a);
        rearrangeWithoutExtraSpace(a);
    }

    private static void rearrangeWithoutExtraSpace(int[] a) {
        /*
        Another Approach (Swap elements in Array) :
1) Iterate through elements in array
2) If arr[i] >= 0 && arr[i] != i, put arr[i] at i ( swap arr[i] with arr[arr[i]])

Below is the implementation of above approach.
         */
        for(int i=0; i<a.length;i++) {
            if(a[i] > 0 && a[i] !=i) {
                int temp = a[i];
                a[i] = a[a[i]];
                a[a[i]] = temp;
            }
        }

        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + "  ");
        }
    }

    private static void reArrangeExtraSpace(int[] a) {
        Set<Integer> elementsSet = new HashSet<Integer>();
        for (int i=0; i<a.length; i++) {
            elementsSet.add(a[i]);
        }

        for(int i=0;i<a.length;i++){
            if(elementsSet.contains(i)){
                a[i] = i;
            }
            else {
                a[i] = -1;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + "  ");
        }

    }
}
