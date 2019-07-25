package dynamicprogramming;

/**
 * @author rashmi on 2019-07-23

 */
public class MinCostPath {
    public static void main(String[] args) {
        int cost[][] = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3} };

        System.out.println(minCostRecursive(cost, 2, 2));
        System.out.println(minCostDp(cost, 2, 2));
    }

    private static int minCostDp(int[][] cost, int m, int n) {

        int[][] dp = new int[m+1][n+1];
        dp[0][0] = cost[0][0];
        for(int i=1;i<=m;i++){
            dp[i][0] = dp[i-1][0] + cost[i][0];
        }

        for(int i=1;i<=n;i++){
            dp[0][i] = dp[0][i-1] + cost[0][i];
        }

        for(int i=1; i<=m;i++){
            for(int j=1; j<=n;j++){
                dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + + cost[i][j];
            }
        }
        return dp[m][n];
    }

    private static int minCostRecursive(int[][] cost, int m, int n) {
        if( n<0 || m < 0){
            return Integer.MAX_VALUE;
        }
        if( n==0 && m == 0){
            return cost[m][n];
        }

        return cost[m][n] + Math.min(minCostRecursive(cost, m-1, n-1),
                Math.min(minCostRecursive(cost, m-1, n),
                        minCostRecursive(cost, m, n-1)));
    }
}
