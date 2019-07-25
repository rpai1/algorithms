package dynamicprogramming;

/**
 * @author rashmi on 2019-07-23

 */
public class MinimumJumpsToReachEnd {
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
        int n = arr.length;
        System.out.println("Minimum number of jumps to reach end is "
                + minJumpsRecursion(arr, 0, n-1));
        System.out.println("Minimum number of jumps to reach end is : "+
                minJumpsDp(arr,arr.length));
    }

    private static int minJumpsDp(int[] a, int n) {

        int[] dp = new int[n+1];
        if( n==0 || a[0] == 0){
            return Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i=1; i<n;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=0; j<i;j++){
                if( i<= j + a[j]  && dp[j] != Integer.MAX_VALUE ){
                    dp[i] = Math.min(dp[i], dp[j]+1);
                    break;
                }
            }
        }
        return dp[n-1];
    }

    private static int minJumpsRecursion(int[] a, int start, int end) {

        if(end == 0){
            return 0;
        }
        if(start == end){
            return 0;
        }
        if (a[start] == 0)
            return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;    //this is because a[k] -> element represents max no of steps that can be taken forward
        for(int k=start+1 ; k<=end &&k<=(start + a[start]) ; k++){
            int jumps = minJumpsRecursion(a, k, end);
            if( jumps != Integer.MAX_VALUE && jumps+1 < min){
                min = jumps+1;
            }
        }
        return min;
    }
}
