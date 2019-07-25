package arrays;

import java.util.HashSet;

/**
 * @author rashmi on 2019-07-04

 */
// store all elements of b in a hashset, use kadanes to exclude elements in hash set
public class MaximumSumSubarrayExcludingCertainElements {

    public static void main(String[] args) {
        int A[] = { 3, 4, 5, -4, 6 };
        int B[] = { 1, 8, 5 };

        int sum  = findMaximumSumExcludingElementsInB(A, B, A.length, B.length);
        System.out.println(sum);
    }

    private static int findMaximumSumExcludingElementsInB(int[] a, int[] b, int m, int n) {

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<n;i++){
            hashSet.add(b[i]);
        }
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for(int i=0; i<m ; i++){

            if(hashSet.contains(a[i])){
                maxEndingHere = 0;
                continue;
            }
                maxEndingHere =  Math.max(maxEndingHere,  maxEndingHere + a[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

        }
        return maxSoFar;
    }

    private static boolean isFound(int[] b, int low, int high, int key) {

        if( low> high) {
            return  false;
        }
        if(low == high){
            return  false;
        }
        int mid = ( low+high)/2;
        if(b[mid] == key) {
            return true;
        }
        if( key > b[mid]){
            return isFound(b, mid+1, high, key);
        }
        return isFound(b, low, mid-1, key);
    }
}
