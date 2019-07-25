package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
public class PossiblePathsFromTopLeftToBottomRight {
    public static void main(String[] args) {
        System.out.println(numberOfPathsRecursive(3, 3));
        System.out.println(numberOfPathsDp(3, 3));

    }

    private static int numberOfPathsDp(int m, int n) {

        int[][] dp = new int[m][n];

        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
        }

        for(int i=1; i<m ;i++){
            for(int j=1; j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    private static int numberOfPathsRecursive(int m, int n) {
        if( m==1 || n==1){
            return 1;
        }
        return numberOfPathsRecursive(m-1, n) + numberOfPathsRecursive(m , n-1);
    }
}
