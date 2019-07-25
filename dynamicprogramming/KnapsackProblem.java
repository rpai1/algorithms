package dynamicprogramming;

/**
 * @author rashmi on 2019-07-25

 */
public class KnapsackProblem {
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;
        System.out.println(knapSackRecursive(W, wt, val, n));
        System.out.println(knapSackDp(W, wt, val, n));
    }

    private static int knapSackDp(int W, int[] wt, int[] val, int n) {

        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i <= W; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                // weight of an item is greater than the required weight, exclude the item
                if (wt[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // else -> take the max of exclude an item , or include an item-> remove its weight nad add value
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt[i - 1]] + val[i - 1]);
                }
            }
        }
        return dp[n][W];
    }

    private static int knapSackRecursive(int W, int[] wt, int[] val, int n) {

        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] > W) {
            return knapSackRecursive(W, wt, val, n - 1);
        }

        return Math.max((val[n - 1] + knapSackRecursive(W - wt[n - 1], wt, val, n - 1)),
                knapSackRecursive(W, wt, val, n - 1));
    }


}
