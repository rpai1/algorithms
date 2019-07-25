package dynamicprogramming;

/**
 * @author rashmi on 2019-07-19

 */

class NumberOfWaysToPartitionASetBellNumber {

    private static int bellNumber(int n) {

        int[][] dp = new int[n + 1][n + 1];

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][i - 1];
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
            }
        }

        return dp[n][0];
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 5; n++)
            System.out.println("Number of wasy to partition a set ( bell number) " + n + " is " + bellNumber(n));
    }
}
