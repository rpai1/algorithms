package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
// question -> user can only throw 3, 5 and 10 https://www.geeksforgeeks.org/count-number-ways-reach-given-score-game/
    // this is variation of coins change problem
public class CountNumberOfWaysToReachAGivenScore {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Count for "+n+" is "+count(n));

        n = 13;
        System.out.println("Count for "+n+" is "+count(n));
    }

    private static int count(int n) {
        int[] dp = new int[n+1];

        dp[0] = 1;
        for(int i=3; i<=n;i++){
            dp[i] = dp[i] + dp[i-3];
        }
        for(int i=5; i<=n;i++){
            dp[i] = dp[i] + dp[i-5];
        }
        for(int i=10; i<=n;i++){
            dp[i] = dp[i] + dp[i-10];
        }

        return dp[n];
    }
}
