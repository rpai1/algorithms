package arrays;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class RearrangeLargestSmallest {

    public static void main(String[] args) {
        int[] a = {5, 8, 1, 4, 2, 9, 3, 7, 6};
        rearrange(a);

    }

    private static void rearrange(int[] a) {
        Arrays.sort(a);
        int[] b = new int[a.length+1];

        int k=0;
        for(int i=0, j= (a.length-1); i<=(a.length/2) || j>a.length/2 ; i++, j-- ) {

            b[k] = a[i];
            k++;
            b[k] = a[j];
            k++;
        }

        for(int i=0; i<a.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
