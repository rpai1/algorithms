package dynamicprogramming;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-24

 */
public class MinimumRemovalsFRomArrayToMakemaxMinusMinLessThanOrEqualToK {
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 9, 10, 11, 12, 17, 20 };
        int n = a.length;
        int k = 4;
        Arrays.sort(a);
        int count =0;
        System.out.print(removals(a, 0,n-1, k, count));
    }

    private static int removals(int[] a, int start, int end, int k, int count) {

        int min = a[start];
        int max = a[end];

        if( start == end){
            return  count;
        }
        if( start > end){
            return -1;
        }
        if( max - min <=k){
            return count;
        }
         return Math.min( removals(a, start+1, end, k, count), removals(a, start, end-1, k, count))+1;
    }
}
