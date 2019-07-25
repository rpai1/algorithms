package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
public class EditDistance {
    public static void main(String[] args) {
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println(editDistRecursive(str1, str2, str1.length(), str2.length()));
        System.out.println(editDistDp(str1, str2, str1.length(), str2.length()));

    }

    private static int editDistDp(String str1, String str2, int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0; j<=n;j++){
                if(i==0){
                  dp[i][j] = j;
                }
                else if( j==0){
                    dp[i][j] = i;
                }
                else if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    dp[i][j] = min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1])+1;
                }
            }
        }
        return dp[m][n];
    }

    private static int editDistRecursive(String str1, String str2, int m, int n) {

        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return editDistRecursive(str1, str2, m - 1, n - 1);
        }
        return 1+ min(editDistRecursive(str1, str2, m - 1, n),
                editDistRecursive(str1, str2, m, n - 1),
                editDistRecursive(str1, str2, m - 1, n - 1));
    }

    private static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
