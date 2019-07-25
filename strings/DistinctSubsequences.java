package strings;

/**
 * @author rashmi on 2019-07-10

 */

import java.io.*;
        import java.util.*;

class DistinctSubsequences{
    private static int countDistinctSubsequences(String str){

        int n = str.length();
        int[] dp = new int[n+1];
        int[] lastOccurance = new int[256];
        Arrays.fill(lastOccurance, -1);
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            dp[i] = 2*dp[i-1];

            if(lastOccurance[str.charAt(i-1)]!= -1){
                dp[i] = dp[i] - dp[lastOccurance[str.charAt(i-1)]];
            }
            lastOccurance[str.charAt(i-1)] = i-1;
        }
        return dp[n];
    }

    public static void main(String[] args)
    {
        System.out.println(countDistinctSubsequences("gfg"));
    }
}


