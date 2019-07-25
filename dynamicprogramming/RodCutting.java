package dynamicprogramming;

/**
 * @author rashmi on 2019-07-22

 */
public class RodCutting {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println("Maximum Obtainable Value is "+
                cutRodRecursive(arr, size));
        System.out.println("Maximum Obtainable Value is " +
                cutRodDp(arr, size));
    }

    private static int cutRodDp(int[] price, int n) {

        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1; i<=n;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                max = Math.max(max, price[j]+dp[i-j-1]);
            }
            dp[i] = max;
        }

        return dp[n];
    }

    private static int cutRodRecursive(int[] price, int n) {

        if(n<=0){
            return 0;
        }
        int maxValue = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            maxValue = Math.max(maxValue, price[i] + cutRodRecursive(price, n-i-1));
        }
       return maxValue;
    }
}
