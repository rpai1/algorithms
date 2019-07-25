package arrays;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class SmallestDifferenceTripletsFromThreeArrays {

    public static void main(String[] args) {
        int arr1[] = {5, 2, 8};
        int arr2[] = {10, 7, 12};
        int arr3[] = {9, 14, 6};

        int n = arr1.length;

        smallestDifferenceTriplet(arr1, arr2, arr3, n);
    }

    private static void smallestDifferenceTriplet(int[] a, int[] b, int[] c, int n) {
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int i=0, j=0, k=0;
        int diff = Integer.MAX_VALUE;
        int first =0, second = 0, third = 0;
        while(i<n && j< n && k< n ){

            int sum = a[i] + b[j] + c[k];

            int max =  Math.max(Math.max(a[i], b[j]), c[k]);

            int min = Math.min(Math.min(a[i], b[j]), c[k]);

            if( min == a[i]){
                i++;
            }
            else if( min == b[j]){
                j++;
            }
            else {
                k++;
            }
            if( max-min < diff){
                diff = max-min;
                first = min;
                second = sum - ( max + min);
                third = max;
            }
        }

        System.out.println(first + " "+ second + " "+ third);
    }
}
