package dynamicprogramming;

/**
 * @author rashmi on 2019-07-23

 */
// similar: https://www.geeksforgeeks.org/maximum-value-choice-either-dividing-considering/
public class MaxSumByBreakingNumberIntoThreeParts {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(breakSumRecursive(n));
        System.out.println(breakSumDp(n));

    }

    private static int breakSumDp(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n;i++){
            dp[i] = Math.max( (dp[i/2] + dp[i/3] + dp[i/4]), i );
        }

        return dp[n];
    }

    private static int breakSumRecursive(int n) {
        if( n== 0 || n==1){
            return n;
        }
        return Math.max((breakSumRecursive(n/2) + breakSumRecursive(n/3) + breakSumRecursive(n/4)) , n);
    }
}
