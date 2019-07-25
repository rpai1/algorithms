package arrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author rashmi on 2019-07-04

 */
public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] a= {1, 4, 45, 6, 10, -8};
        int sum = 16;

        findPairWithGivenSumUsingSorting(a, a.length, sum);
        findPairWithGivenSumUsingHashing(a, a.length, sum);
    }

    private static void findPairWithGivenSumUsingHashing(int[] a, int n, int sum) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i< n ;i++) {
            int diff = sum-a[i];
            if(hashSet.contains(diff)){
                System.out.println(a[i] + " " + (diff));
            }
            hashSet.add(a[i]);
        }
        System.out.println();
    }

    private static void findPairWithGivenSumUsingSorting(int[] a, int n, int sum) {
        Arrays.sort(a);

        int l = 0;
        int r = n-1;
        while(l<=r){
            int s = a[l] + a[r];
            if( s == sum) {
                System.out.println(a[l] + " " + a[r]);
                l++;
                r--;
            }
            else if( s> sum) {
                r--;
            }
            else {
                l++;
            }
        }
    }
}
