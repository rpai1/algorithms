package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class SubArrayOfSizeKWithLeastAverage {
    public static void main(String[] args) {
        int[] a = {3, 7, 90, 20, 10, 50, 40};
        int k = 3;
        int index = getSubArrayWithLeastAverage(a, a.length, k);
        System.out.println(" subarray with least average starts at " + index + " ends at" + (index+k-1));
    }

    private static int getSubArrayWithLeastAverage(int[] a, int n, int k) {

        int curSum = 0;
        int minSum = 0;
        int startIndex = -1;
        for(int i=0; i< k; i++) {
            curSum = curSum + a[i];
        }
        minSum = curSum;
        for(int i= k ; i<n ; i++) {
            curSum = curSum + a[i] - a[i-k];

            if(curSum< minSum) {
                minSum = curSum;
                startIndex = i-k+1;
            }
        }
        return startIndex;
    }
}
