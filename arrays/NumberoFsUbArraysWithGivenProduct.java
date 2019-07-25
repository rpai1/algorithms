package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class NumberoFsUbArraysWithGivenProduct {
    public static void main(String[] args) {
        int arr[] = new int[]{ 2, 1, 1, 1, 4, 5 };

        int k = 4;
        findSbArraysWithGivenProduct(arr, arr.length, k);
    }

    private static void findSbArraysWithGivenProduct(int[] a, int n, int k) {

        int start =0;
        int p=1,endval = 0, countOnes = 0, res = 0;

        while(endval < n){
            p = p*a[endval];

            if( p> k){
                while(start <= endval && p > k){

                    p = p/a[start];
                    start++;
                }
            }

            if( p == k) {
                countOnes = 0;
                while (endval + 1 < n && a[endval + 1] == 1) {
                    countOnes++;
                    endval++;
                }

                res = res + (countOnes + 1);

                while (start < endval && a[start] == 1) {
                    res = res + (countOnes + 1);
                    start++;
                }
                p = p/a[start];
                start++;
            }
            endval ++;
        }
        System.out.println(res);
    }
}
