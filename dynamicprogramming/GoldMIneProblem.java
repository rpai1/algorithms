package dynamicprogramming;

/**
 * @author rashmi on 2019-07-19

 */

import java.util.Arrays;

class GoldMIneProblem {

    private static int getMaxGold(int[][] gold, int m, int n) {


        int[][] maxMine = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(maxMine[i], 0);
        }

        for (int col = n - 1; col >= 0; col--) {

            for (int row = 0; row < m; row++) {

                int right = col == n - 1 ? 0 : maxMine[row][col + 1];

                int rightUp = col == n - 1 || row == 0 ? 0 : maxMine[row - 1][col + 1];

                int rightDown = row == m - 1 || col == n - 1 ? 0 : maxMine[row + 1][col + 1];

                maxMine[row][col] = gold[row][col] + Math.max(right, Math.max(rightUp, rightDown));
            }
        }

        int res = maxMine[0][0];
        for (int i = 0; i < m; i++) {
            if (maxMine[i][0] > res) {
                res = maxMine[i][0];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int gold[][] = {{1, 3, 1, 5},
                {2, 2, 4, 1},
                {5, 0, 2, 3},
                {0, 6, 1, 2}};

        int m = 4, n = 4;

        System.out.print(getMaxGold(gold, m, n));
    }
}
