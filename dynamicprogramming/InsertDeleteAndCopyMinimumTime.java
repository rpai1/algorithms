package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
public class InsertDeleteAndCopyMinimumTime {
    public static void main(String[] args) {
        int N = 9;
        int insert = 1, remove = 2, copy = 1;
//        System.out.println(minTimeForWritingCharsRecursive(N, insert,remove, copy));
        System.out.println(minTimeForWritingCharsDP(N, insert,remove, copy));

    }

    private static int minTimeForWritingCharsDP(int n, int insert, int remove, int copy) {
        if (n == 0)
            return 0;
        if (n == 1)
            return insert;
        int dp[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                dp[i] = Math.min(dp[i - 1] + insert, dp[i / 2] + copy);
            else {
                dp[i] = Math.min(dp[i - 1] + insert, dp[(i + 1) / 2] + copy + remove);
            }
        }
        return dp[n];
    }

    private static int minTimeForWritingCharsRecursive(int n, int insert, int remove, int copy) {
        if( n==0){
            return 0;
        }

        if( n == 1){
            return insert;
        }

        if( n%2 ==0 ){
            return  Math.min( minTimeForWritingCharsRecursive(n-1, insert, remove, copy),
                    minTimeForWritingCharsRecursive(n/2+copy+remove, insert, remove, copy));

        }
        return Math.min(minTimeForWritingCharsRecursive( n-1, insert, remove, copy),
                minTimeForWritingCharsRecursive(((n+1)/2)+copy+remove, insert, remove, copy));
    }
}
