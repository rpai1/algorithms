package dynamicprogramming;

/**
 * @author rashmi on 2019-07-22

 */
public class SubSetSumProblem {

    private static boolean isSubsetSumRecursion(int[] set, int n, int sum) {
        if( sum== 0 ){
            return true;
        }

        if(n == 0 && sum !=0){
            return false;
        }

        if( set[n-1] > sum){
            return isSubsetSumRecursion(set, n-1, sum);
        }

        return isSubsetSumRecursion(set, n-1, sum) || isSubsetSumRecursion(set , n-1, sum-set[n-1]);
    }


    public static void main(String[] args) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        if (isSubsetSumRecursion(set, n, sum) == true && isSubsetSumDp(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }

    private static boolean isSubsetSumDp(int[] set, int n, int sum) {
        boolean[][] dp = new boolean[sum+1][n+1];

        // sum is 0, result is true
        for(int i=0;i<=n;i++){
            dp[0][i] = true;
        }

        // n is 0 and sum is not 0, result is false
        for(int i=0;i<=sum;i++){
            dp[i][0] = false;
        }

        for(int i=1;i<=sum;i++){
            for(int j=1; j<=n;j++){
                dp[i][j] = dp[i][j-1];
                if(i >= set[j-1]){
                dp[i][j] = dp[i][j-1] || dp[i-set[j-1]][j-1];
                }
            }
        }

        return dp[sum][n];
    }
}
