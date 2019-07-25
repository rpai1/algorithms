package dynamicprogramming;

/**
 * @author rashmi on 2019-07-19

 */

class BinomialCoefficient {

    private static int binomialCoeff(int n, int k) {

        int[][] dp = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || i == j) {
                    dp[i][j] = 1;

                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        return dp[n][k];
    }

    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println("Value of C(" + n + "," + k + ") is " + binomialCoeff(n, k));
    }
}
