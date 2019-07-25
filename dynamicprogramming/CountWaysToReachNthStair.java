package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
// similar one -> https://www.geeksforgeeks.org/count-ofdifferent-ways-express-n-sum-1-3-4/
// another one -> https://www.geeksforgeeks.org/count-number-of-ways-to-cover-a-distance/
public class CountWaysToReachNthStair {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findStepsRecursive(n));
        System.out.println(findStepsDP(n));

    }

    private static int findStepsDP(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n;i++){
            dp[i] = dp[i-3] + dp[i-2]+dp[i-1];
        }

        return dp[n];

    }

    private static int findStepsRecursive(int n) {
        if(n==0){
            return 1;
        }

        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return findStepsRecursive(n-3) + findStepsRecursive(n-2) + findStepsRecursive(n-1);
    }


}
