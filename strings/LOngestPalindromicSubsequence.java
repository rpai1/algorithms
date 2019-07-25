package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;

class LOngestPalindromicSubsequence{
    private static int longestPalindromicSubsequence(char[] str){
        if(str.length == 0){
            return 0;
        }
        int n= str.length;
        int[][] dp = new int[n][n];

        for(int i=0;i<n;i++){
            dp[i][i] =1;
        }

        for(int i=n-1; i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(str[i] == str[j]){
                    dp[i][j] = 2+ dp[i+1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }

        return dp[0][n-1];
    }

    public static void main(String[] args)
    {
        String str = "acccb";
        int n = longestPalindromicSubsequence(str.toCharArray());
        System.out.println(n);
    }
}


