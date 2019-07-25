package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;
//not fully done yet
class FindAndPrintLCSLongestCommonSubsequence{
    private static int lcs(String X, String Y, int m, int n){
        if( m== 0 || n== 0){
            return 0;
        }
        if(X.charAt(m-1) == Y.charAt(n-1)){
            return 1+ lcs(X, Y, m-1, n-1);
        }
        else {
            return Math.max(lcs(X, Y, m-1, n), lcs(X, Y, m, n-1));
        }
    }

    private static int lcsDP(char[] X, char[] Y, int m, int n){

        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(X[i-1] == Y[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    private static HashSet<String> findLCS(String X, String Y, int m , int n, HashSet hSet){

        if( m==0 || n==0){
            hSet.add("");
            return hSet;
        }
        if(X.charAt(m-1) == Y.charAt(n-1)){
            HashSet<String> temp = findLCS(X, Y, m-1, n-1, hSet);
            for(String s : temp){
                hSet.add(s + X.charAt(m-1));
            }
        }
        else {
            if(X.charAt(m-1) > Y.charAt(n-1)){
                HashSet<String> tmp = findLCS(X, Y, m-1, n, hSet);
//                hSet.add(tmp.stream().findFirst(), hSet.stream().findAny());
            }
        }
        return hSet;
    }

    public static void main(String[] args)
    {
        String X = "AGTGATG";
        String Y = "GTTAG";
        int m = X.length();
        int n = Y.length();

        System.out.println("LCS length is " + lcs(X, Y, m, n));
        System.out.println("LCS length is " + lcsDP(X.toCharArray(), Y.toCharArray(), m, n));

        HashSet<String> hSet = new HashSet<String>();
        HashSet<String> s = findLCS(X, Y, m, n, hSet);

        for (String str : s) {
            System.out.println(str);
        }
    }
}


