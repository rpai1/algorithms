package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class SmallestSubarrayWithSumGraterThanGivenValue {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 0, 19};
        int x  =  51;

        findSmallestSubArraySum(arr, arr.length, x);
    }

    private static void findSmallestSubArraySum(int[] a, int n, int x) {

        int curSum = 0;
        int minLen = n-1;

        int start = 0;
        int end = 0;

        while(end < n){

            while (curSum<=x &&  end < n) {
                curSum = curSum + a[end];
                end ++;
            }

            while(curSum > x && start < n ) {
                if(end - start < minLen) {
                  minLen = end - start ;
                }
                curSum = curSum - a[start];
                start ++;
            }

        }
        System.out.println(minLen);
    }

}
