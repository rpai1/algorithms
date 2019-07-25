package dynamicprogramming;

/**
 * @author rashmi on 2019-07-23

 */
public class MaxWeightPath {
    public static void main(String[] args) {
        int mat[][] = {  { 4, 1 ,5 ,6 , 1 },
                { 2 ,9 ,2 ,11 ,10 },
                { 15,1 ,3 ,15, 2 },
                { 16, 92, 41,4,3},
                { 8, 142, 6, 4, 8 }
        };
        int N = mat.length;
        System.out.println("Maximum Path Sum : "+
                maxCostDp(mat, N));
    }

    private static int maxCostDp(int[][] a, int n) {
        int[][] dp = new int[n+1][n+1];

        dp[0][0] = a[0][0];
        for(int i=1;i<n;i++){
            dp[i][0] = dp[i-1][0] + a[i][0];
        }

        for(int i=2; i<n;i++){
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max( dp[i-1][j-1], dp[i-1][j] ) + a[i][j];
            }
        }

        int res = 0;
        for(int i=0;i<=n;i++){
            for(int j=0; j<=n;j++){
                if(dp[i][j] > res){
                    res = dp[i][j];
                }
            }
        }
        return res;
    }
}
