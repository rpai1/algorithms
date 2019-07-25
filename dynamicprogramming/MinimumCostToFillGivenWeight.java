package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rashmi on 2019-07-24

 */
//https://www.geeksforgeeks.org/minimum-cost-to-fill-given-weight-in-a-bag/ like knapsack -> imp
public class MinimumCostToFillGivenWeight {
    public static void main(String[] args) {
        int cost[] = {1, 2, 3, 4, 5}, W = 5;
        int n = cost.length;

        System.out.println(MinimumCost(cost, n, W));
    }

    private static int MinimumCost(int[] cost, int n, int w) {
        List<Integer> value = new ArrayList<>();
        List<Integer> weights = new ArrayList<>();

        int size =0;
        for(int i=1;i<=n;i++){
            if(cost[i-1] != -1){
                value.add(cost[i-1]);
                weights.add(i);
                size ++;
            }
        }
        n= size;

        int[][] dp = new int[n+1][w+1];

        for(int i=0;i<=w;i++){
            dp[0][i] = Integer.MAX_VALUE;
        }

        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
        }
        for(int i=1; i<=n;i++){
            for(int j=1;j<=w; j++){
                if(weights.get(i-1) > j){
                 dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = Math.min(dp[i-1][j], (dp[i][j-weights.get(i-1)]+ value.get(i-1)));
                }
            }
        }

        return dp[n][w] == Integer.MAX_VALUE ? -1: dp[n][w];
    }
}
