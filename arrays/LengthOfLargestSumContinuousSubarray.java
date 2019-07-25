package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class LengthOfLargestSumContinuousSubarray {

    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int len = findLength(a, a.length);
        System.out.println(len);
    }

    private static int findLength(int[] a, int n) {

        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        int start = 0;
        int end = 0;
        int s= 0;

        for(int i=0;i<n;i++){
            maxEndingHere = maxEndingHere + a[i];
            if(maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                end =i;
                start = s;
            }
            if( maxEndingHere < 0) {
                maxEndingHere = 0;
                s = i+1;
            }
        }

        return end-start+1;
    }
}
