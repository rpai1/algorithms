package arrays;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class MinimizeTheDifferenceInHeights {
    public static void main(String[] args) {
        int[] a= {1, 5, 15, 10};
        int k = 3;

        int minimumDifference = minimiZeDifference(a, a.length, k);
        System.out.println(minimumDifference);
    }

    private static int minimiZeDifference(int[] a, int n, int k) {
        Arrays.sort(a);

        int res = a[n-1] - a[0];
        int big = a[n-1];
        int small = a[0];
        int add, subtract;

        if (small > big)
        {
            int temp = small;
            small = big;
            big = temp;
        }

        for(int i=1; i<n-1; i++){
            subtract = a[i]- k;
            add = a[i] + k;
            if(subtract >= small || add <= big) {
                continue;
            }
//            else if(subtract <= small) {
//                small = subtract;
//            }
//            else if( add >= big){
//                big = add;
//            }

            if(big-subtract <= add -small  ){
                small = subtract;
            }
            else {
                big = add;
            }
        }
        return Math.min(res, big-small);
    }
}
