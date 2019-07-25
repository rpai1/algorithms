package dynamicprogramming;

/**
 * @author rashmi on 2019-07-23

 */
//https://www.geeksforgeeks.org/sequences-given-length-every-element-equal-twice-previous/
public class TotalNumberoFPossibleSequences {
    public static void main(String[] args) {
        int m = 10;
        int n = 4;
        System.out.println("Total number of possible sequences "+
                getTotalNumberOfSequencesRecursion(m, n));
        System.out.println("Total number of possible sequences "+
                getTotalNumberOfSequencesDp(m, n));
    }

    private static int getTotalNumberOfSequencesDp(int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for(int i=0; i<=m;i++){
            for(int j=0;j<=n;j++){
                // Base case : If length of sequence is 0
                // or maximum value is 0, there cannot
                // exist any special sequence
                if (i == 0 || j == 0)
                    dp[i][j] = 0; // similar to n==0

                else if(i<j){
                    dp[i][j] = 0; // similar to m<n
                }
                else if( j==1){
                    dp[i][j] =i;
                    // if n==1 ; there is only one element , m in the sequence
                }
                else {
                    dp[i][j] = dp[i-1][j] + dp[i/2][j-1];
                }

            }
        }
        return dp[m][n];
    }

    private static int getTotalNumberOfSequencesRecursion(int m, int n) {
        if(m < n){
            return 0;
            // A special sequence cannot exist if length
            // n is more than the maximum value m.
        }
        if(n==0){
            return 1;
        }
        return getTotalNumberOfSequencesRecursion(m-1, n) + getTotalNumberOfSequencesRecursion(m/2, n-1);
    }
}

