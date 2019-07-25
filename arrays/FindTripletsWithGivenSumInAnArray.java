package arrays;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class FindTripletsWithGivenSumInAnArray {
    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr[] = {0, -1, 2, -3, 1};
        int sum2 = 0;

        findTriplets(A, sum, A.length);
        findTriplets(arr, sum2, arr.length);
    }

    private static void findTriplets(int[] a, int sum, int n) {

        Arrays.sort(a);

       for(int i=0;i<n;i++){
           int l= i+1;
           int r = n-1;
           while(l<r) {
               if (a[l] + a[r] + a[i] == sum) {
                   System.out.print("Triplet is " + a[i] + ", " + a[l] + ", " + a[r]);
                   l++;
                   r--;
               } else if ((a[l] + a[r] + a[i]) < sum) {
                   l++;
               } else if ((a[l] + a[r] + a[i]) > sum) {
                   r--;
               }
           }
       }

    }
}
