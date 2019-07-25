package dynamicprogramming;

/**
 * @author rashmi on 2019-07-22

 */
public class GolomobSequence {
    public static void main(String[] args) {
        int n = 9;
        printGolomb(n);

    }

    private static int printGolomb(int n) {

        int dp[] = new int[n+1];

        dp[1] = 1;
        for(int i=2; i<=n;i++){
            dp[i] =  1+ dp[i-dp[dp[i-1]]];
        }

        for (int i = 1; i <=n ; i++) {
            System.out.println(dp[i]);
        }
        return dp[n];
    }
}
