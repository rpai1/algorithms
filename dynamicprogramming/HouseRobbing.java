package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
public class HouseRobbing {
    public static void main(String[] args) {
        int hval[] = {6, 7, 1, 3, 8, 2, 4};
        int n = hval.length;
        int profit = 0;
        System.out.println("Maximum loot value : " + maxLootRecursive(hval, n, profit));
        System.out.println("Maximum loot value : " + maxLootDp(hval, n));
    }

    private static int maxLootDp(int[] hval, int n) {

        if(n==0){
            return 0;
        }
        if( n==1){
            return hval[0];
        }
        if( n==2){
            return Math.max(hval[0], hval[1]);
        }

        int[] dp = new int[n];

        dp[0] = hval[0]; //like n is 1
        dp[1] = Math.max(hval[0], hval[1]); // like n is 2

        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-2]+hval[i], dp[i-1]);
        }
        return dp[n-1];

    }

    private static int maxLootRecursive(int[] hval, int n, int profit) {
        if( n==0){
            return 0;
        }
        if( n ==1){
            return hval[0];
        }

        if( n==2){
            return Math.max(hval[0], hval[1]);
        }

        profit = profit + Math.max(maxLootRecursive(hval, n-1, profit), maxLootRecursive(hval, n-2, profit+hval[n-1]));
        return profit;

    }
}
