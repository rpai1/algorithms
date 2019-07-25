package dynamicprogramming;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-22

 */
public class LargestDivisiblePairsSubset {
    public static void main(String[] args) {
        int[] a = { 1, 3, 6, 13, 17, 18 };
        int n = a.length;
        System.out.println(largestSubset(a, n));
    }

    private static int largestSubset(int[] a, int n) {
        Arrays.sort(a);
        int[] dp = new int[n];
        dp[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            int max = 0;
            for(int j=i+1; j<n;j++){
               if(a[j]%a[i]==0){
                   max = Math.max(max, dp[j]);
               }
            }
           dp[i] = 1+max;
        }

       return Arrays.stream(dp).max().getAsInt();
    }
}
