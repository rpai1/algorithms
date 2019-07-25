package dynamicprogramming;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-23

 */
public class FindMaxLengthSnakeSequence {
    public static void main(String[] args) {
        int mat[][] = {
                {9, 6, 5, 2},
                {8, 7, 6, 5},
                {7, 3, 1, 6},
                {1, 1, 1, 7},
        };

        snakeSequence(mat, mat.length, mat[0].length);
    }

    private static void snakeSequence(int[][] mat, int row, int col) {

        int[][] dp = new int[row + 1][col + 1];
        dp[0][0] = 1;

        int max = Integer.MIN_VALUE;
        int maxLength = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int left = j - 1 >= 0 ? (Math.abs(mat[i][j - 1] - mat[i][j]) == 1 ? dp[i][j - 1] + 1 : 0) : 0;
                int above = i - 1 >= 0 ? (Math.abs(mat[i - 1][j] - mat[i][j]) == 1 ? dp[i - 1][j] + 1 : 0) : 0;
                max = Math.max(left, above);
                dp[i][j] = Math.max(max, dp[i][j]);
                maxLength = Math.max(maxLength, dp[i][j]);
            }
        }

        for (int i = 0; i < row; i++) {
            System.out.print(Arrays.toString(dp[i]));
            System.out.println();
        }

        System.out.println(maxLength);
    }
}
