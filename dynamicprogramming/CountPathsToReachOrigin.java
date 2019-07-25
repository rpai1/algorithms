package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
public class CountPathsToReachOrigin {
    public static void main(String[] args) {
        int n = 3, m = 2;
        System.out.println (" Number of Paths " + countPathsRecursive(n, m));
        System.out.println (" Number of Paths " + countPathsDp(n, m));

    }

    private static int countPathsDp(int n, int m) {
        int[][] dp = new int[n+1][m+1];

        for(int i=0;i<=m;i++){
            dp[0][i] = 1;
        }

        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }

        for(int i=1; i<=n;i++){
            for(int j=1; j<=m;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[n][m];
    }

    private static int countPathsRecursive(int n, int m) {
        if( n==0 || m ==0){
            return 1;
        }
       return countPathsRecursive(n-1, m) + countPathsRecursive(n, m-1);
    }
}
