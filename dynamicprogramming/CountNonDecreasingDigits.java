package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */

// this is not DP
    /*
    Count of non-decreasing numbers with n digits =
                                N*(N+1)/2*(N+2)/3* ....*(N+n-1)/n
Where N = 10
     */
public class CountNonDecreasingDigits {
    public static void main(String[] args) {
        int n = 3;
        System.out.print(countNonDecreasing(n));
    }

    private static int countNonDecreasing(int n) {
        int N = 10;
        int count = 1;
        for(int i=1; i<=n; i++){
            count = count*( N+i-1)/i;
        }
        return  count;
    }
}
