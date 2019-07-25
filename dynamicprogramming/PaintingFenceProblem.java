package dynamicprogramming;

/**
 * @author rashmi on 2019-07-22

 */
public class PaintingFenceProblem {
    public static void main(String[] args) {
        int n = 3, k = 2;
        System.out.println(countWays(n, k));
    }

    private static int countWays(int n, int k) {
        int[] dp = new int[n+1];
        dp[0] = k;
        dp[1] = k;
        for(int i=2; i<=n;i++){
            dp[i] = (k-1)*(dp[i-1]+ dp[i-2]);
        }

        return dp[n];
    }
}
