package dynamicprogramming;

/**
 * @author rashmi on 2019-07-23

 */
 // https://www.geeksforgeeks.org/path-maximum-average-value/
public class MaxiummPathAverage {
    public static void main(String[] args) {
        int cost[][] = {{1, 2, 3},
                {6, 5, 4},
                {7, 3, 9}};

        System.out.println(maxAverageOfPath(cost, 3));
    }

    private static int maxAverageOfPath(int[][] cost, int n) {

        int[][] dp = new int[n+1][n+1];

        dp[0][0] = cost[0][0];
        for(int i=1;i<n;i++){
            dp[i][0] = dp[i-1][0] + cost[i][0];
            dp[0][i] = dp[0][i-1] + cost[0][i];
        }

        for(int i=1;i<n;i++){
            for(int j=1; j<n;j++){
             dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + cost[i][j];
            }
        }
        /*
        One interesting observation is, the only allowed moves are down and right,
        we need N-1 down moves and N-1 right moves to reach the destination (bottom rightmost).
        So any path from top left corner to bottom right corner requires 2N – 1 cells.
        thas why we need to divide max by 2n-1;( n-1 down, n-1 right )
         */

        return dp[n-1][n-1]/(2*n-1);

    }
}
