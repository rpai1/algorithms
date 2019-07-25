package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class maximumAverageSubArrayOfKLength {
    public static void main(String[] args) {
        int[] a = {1, 12, -5, -6, 50, 3};
        int k= 4;
        int maxIndex = getMaximumSum(a, a.length, k);
        System.out.println(" maximum sum starts at " + maxIndex + " and ends at " + (maxIndex+k-1));
    }

    private static int getMaximumSum(int[] a, int n, int k) {

        int sum = 0;
        int maxSum = 0;
        int maxIndStart = 0;

        for(int i=0;i<k;i++){
            sum = sum + a[i];
        }

        maxSum = sum;

        for(int i=k; i<n; i++){

            sum = sum + a[i] - a[i-k];

            if(sum > maxSum) {
                maxSum = sum;
                maxIndStart = i-k+1;
            }
        }

        return maxIndStart;
    }
}
