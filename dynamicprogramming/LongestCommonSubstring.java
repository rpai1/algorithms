package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
public class LongestCommonSubstring {
    public static void main(String[] args) {
        String X = "OldSite:GeeksforGeeks.org";
        String Y = "NewSite:GeeksQuiz.com";

        int m = X.length();
        int n = Y.length();

        int count=0;
        System.out.println("Length of Longest Common Substring is "
                + LCSubSirRecursive(X, Y, m, n, count));
//        super slow !! takes ages !!

        System.out.println("Length of Longest Common Substring is "
                + LCSubStrDp(X, Y, m, n, count));
    }

    private static int LCSubStrDp(String x, String y, int m, int n, int count) {
        int[][] dp = new int[m+1][n+1];

        int max =0;
        for(int i=0;i<=m;i++){
            for(int j=0; j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(x.charAt(i-1) == y.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    max = Math.max(max, dp[i][j]);
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }
        return max;
    }

    private static int LCSubSirRecursive(String s1, String s2, int m, int n, int count) {

        if( m==0 || n==0){
            return count;
        }

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            count =  LCSubSirRecursive(s1, s2, m-1, n-1, count+1);
        }

        count= Math.max(count, Math.max(LCSubSirRecursive( s1, s2, m, n-1 , 0) ,
                                        LCSubSirRecursive(s1, s2, m-1, n, 0)));
        return count;
    }
}
