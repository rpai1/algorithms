package dynamicprogramming;

/**
 * @author rashmi on 2019-07-23

 */
public class PrintingLongestCommonSubsequence {
    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();
        printLcsDp(X, Y, m, n);
    }

    private static void printLcsDp(String x, String y, int m, int n) {

        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(x.charAt(i-1) == y.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        System.out.println("Length of longest common subsequence is: "+dp[m][n]);

        int index= dp[m][n];

        char[] lcsElements = new char[index+1];


        int i=m, j=n;

        while( i>0 && j > 0){
            if(x.charAt(i-1) == y.charAt(j-1)){
                lcsElements[index] = x.charAt(i-1);
                index--;
                i--;
                j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]){
                i--;
            }
            else {
                j--;
            }
        }
        System.out.print("LCS of "+x+" and "+y+" is ");
        System.out.println(lcsElements);
    }
}


// for longest repeated subsequence, same condition x.charAt(i-1) == y.charAt(j-1) and add i!=j