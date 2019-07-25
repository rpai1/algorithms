package dynamicprogramming;

/**
 * @author rashmi on 2019-07-19

 */

class CoinsChangeproblem {

    private static int countRecursion(int[] a, int m, int n) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (m <= 0 && n >= 1) {
            return 0;
        }

        return countRecursion(a, m - 1, n) + countRecursion(a, m, n - a[m - 1]);
    }

    private static int countDp(int[] a, int m, int n) {

        int[] dp = new int[n + 1];

        dp[0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = a[i]; j <= n; j++) {
                dp[j] = dp[j] + dp[j - a[i]];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6};
        int m = arr.length;
        int sum = 7;
        System.out.println(countRecursion(arr, m, sum));
        System.out.println(countDp(arr, m, sum));
    }
}
