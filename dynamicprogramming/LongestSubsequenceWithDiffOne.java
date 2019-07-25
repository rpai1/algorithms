package dynamicprogramming;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-23

 */
public class LongestSubsequenceWithDiffOne {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 2};
        int n = arr.length;
        System.out.println(longestSubseqWithDiffOne(arr, n));
    }

    private static int longestSubseqWithDiffOne(int[] a, int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, 1);

        for(int i=1; i<n;i++){
            for(int j=0;j<i;j++){
                if(a[i] == a[j]-1 || a[i] == a[j]+1){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int max = 0;
        for(int i=0;i<=n;i++){
          if(dp[i] > max){
              max = dp[i];
          }
        }
        return max;
    }
}
