package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] a= {15, 2, 4, 8, 9, 5, 10, 23};
        int n = a.length;
        int sum = 23;
        findSubArrayWithGivenSum(a, n , sum);
    }

    private static void findSubArrayWithGivenSum(int[] a, int n, int sum) {

        int curSum = a[0];
        int start = 0;
        int p = 0;

        for(int i=1; i<=n; i++){

            while(curSum > sum && start < i-1){
                curSum = curSum - a[start];
                start++;
            }

            if(curSum == sum){
                p = i-1;
                System.out.println(" sum available between " + start + " and" + p );
                return;
            }

            if(i<n){
                curSum = curSum + a[i];
            }
        }

        System.out.println(" no subarray found");

    }
}
