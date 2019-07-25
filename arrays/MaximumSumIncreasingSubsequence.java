package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class MaximumSumIncreasingSubsequence {
    public static void main(String[] args) {
        int[] a = {1, 101, 2, 3, 100, 4, 5};
        int maximumSum = findMaximumSum(a, a.length);
        System.out.println(maximumSum);
    }

    private static int findMaximumSum(int[] a, int n) {

        int[] msis = new int[n];
        int max=0;

        for(int i=0;i<n ;i++){
            msis[i] = a[i];
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++) {
                if(a[i] > a[j] && msis[i] < msis[j]+ a[i]) {
                    msis[i] = msis[j] + a[i];
                }
            }
        }
        for(int i=0;i<n;i++){
            if(max < msis[i]){
                max = msis[i];
            }
        }
        return max;

    }
}
