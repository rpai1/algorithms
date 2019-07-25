package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
/*
https://www.geeksforgeeks.org/probability-reaching-point-2-3-steps-time/
Probability for step length 2 is given i.e. P, probability for step length 3 is 1 – P.
 */
public class ProbabilityOfReachingAPointWithTwoOrThreeSteps {
    public static void main(String[] args) {
        int n = 5;
        float p = 0.2f;
        System.out.printf("%.2f",findProb(n, p));
    }

    private static float findProb(int n, float p) {

        float[] dp = new float[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = p;
        dp[3] = 1-p;
        for(int i=4; i<=n;i++){
            dp[i] = (p*dp[i-2]) + ((1-p)*dp[i-3]);
        }
        return dp[n];

    }
}
