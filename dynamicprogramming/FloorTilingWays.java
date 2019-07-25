package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
//https://www.geeksforgeeks.org/count-number-ways-tile-floor-size-n-x-m-using-1-x-m-size-tiles/
public class FloorTilingWays {
    public static void main(String[] args) {
        int n = 7;
        int m = 4;
        System.out.println("Number of ways = "
                + countWays(n, m));
    }

    /*
             |  1, 1 < = n < m
  count(n) = |  2, n = m
             | count(n-1) + count(n-m), m < n

     */
    private static int countWays(int n, int m) {

        int[] dp = new int[n+1];

        for(int i=0;i<=n;i++){

            if( i<m){ // n < m -> i.e there is only one way u can fill
                dp[i] = 1;
            }

            else if( i > m){ // n > m // there are count(n-1) + count(n-m) ways
                dp[i] = dp[i-1] + dp[i-m];
            }
            else if ( i == m){ // n == m // there are only 2 way. horizontal n vertical
                dp[i] = 2;
            }
        }
        return  dp[n];
    }
}
