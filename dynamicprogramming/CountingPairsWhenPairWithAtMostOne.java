package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
public class CountingPairsWhenPairWithAtMostOne {
    public static void main(String[] args) {
        int x = 3;
        System.out.println( numberOfWaysRecursive(x));
        System.out.println( numberOfWaysDp(x));
    }

    private static int numberOfWaysDp(int x) {
        int[] dp = new int[x+1];
        dp[0] =1;
        dp[1] = 1;
        for(int i=2; i<=x;i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[x];
    }

    private static int numberOfWaysRecursive(int x) {
        if( x==1 || x == 0){
            return 1;
        }
        return numberOfWaysRecursive(x-1) + (x-1)*numberOfWaysRecursive(x-2);
    }
}
