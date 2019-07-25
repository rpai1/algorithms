package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class LargestSumContinuousSubarray {
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        findLargestSumContinuousSubArray(a, a.length);
    }

    private static void findLargestSumContinuousSubArray(int[] a, int n) {

        int maxEndingHere = 0;
        int maxSoFar = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxEndingHere = maxEndingHere + a[i];
            if(maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            if(maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }

        System.out.println(maxSoFar);

    }
}
