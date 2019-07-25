package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
public class BuildingStreetProblem {
    public static void main(String[] args) {
        int n = 5;
        System.out.print("Total no of ways with n = " + n
                + " are: " + countWays(n));

    }

    private static int countWays(int n) {
        int[][] dp = new int[2][n+1];

        dp[0][1] = 1;
        dp[1][1] = 2;
        for(int i=2; i<=n;i++){
            dp[0][i] = dp[0][i-1] + dp[1][i-1];
            dp[1][i] = dp[0][i-1]*2 + dp[1][i-1];
        }
        return dp[0][n] + dp[1][n];
    }
}
