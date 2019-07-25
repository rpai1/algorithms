package dynamicprogramming;

/**
 * @author rashmi on 2019-07-25

 */
public class PuttingItemsInZeroOneKnapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int W = 50;
        int n = val.length;

        printknapSack(W, wt, val, n);
    }

    private static void printknapSack(int W, int[] wt, int[] val, int n) {


        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i <= W; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt[i - 1]] + val[i - 1]);
                }
            }
        }

        int res = dp[n][W];
        System.out.println(res);

        int j = W;
        int i = n;
        for (i = n; i > 0 && res > 0; i--) {

            if (res == dp[i - 1][j]) {
                // this means the item is excluded;
                continue;
            } else {
                System.out.print(wt[i - 1] + " ");
//                System.out.println(val[i - 1]);
                res = res - val[i - 1];
                j = j - wt[i - 1];
            }
        }
    }
}
