package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
import java.util.*;

class CountNumberOfTimesAStringOccursAsASubsequenceInAnother{
    private static int countRecursion(String a, String b, int m, int n){
        if(m==0 && n==0 || n==0){
            return 1;
        }
        if(m==0){
            return 0;
        }
        if(a.charAt(m-1) == b.charAt(n-1)){
            return countRecursion(a, b, m-1, n-1) + countRecursion(a, b, m-1, n);
        }
        else {
            return countRecursion(a, b, m-1, n);
        }
    }

    private static int countDp(String a, String b){
        int m = a.length();
        int n = b.length();

        int[][] dp = new int[m+1][n+1];

        // no main string -> 0 subsequences
        for(int i=0; i<=n;i++){
            dp[0][i] = 0;
        }

        //no pattern -> 1 subsequence -> main string
        for(int i=0;i<=m;i++){
            dp[i][0] = 1;
        }

        for(int i=1; i<=m;i++){
            for(int j=1; j<=n;j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+ dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args)
    {
        String a = "GeeksforGeeks";
        String b = "Gks";
        System.out.println( countRecursion(a, b, a.length(), b.length())) ;
        System.out.println(countDp(a, b));
    }
}


