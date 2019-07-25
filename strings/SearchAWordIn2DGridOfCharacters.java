package strings;

/**
 * @author rashmi on 2019-07-17

 */

class SearchAWordIn2DGridOfCharacters {

    private static void patternSearch(char[][] grid, String word) {

        int rowLen = grid.length;
        int colLen = grid[0].length;
        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                if (isFound(grid, word, row, col, rowLen, colLen)) {
                    System.out.println("pattern found at " + row + ", " + col);
                }
            }
        }
    }

    private static boolean isFound(char[][] grid, String word, int row, int col, int rowLen, int colLen) {

        int[] x = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] y = {0, 1, 1, 1, 0, -1, -1, -1};

        if (grid[row][col] != word.charAt(0)) {
            return false;
        }

        int n = word.length();
        for (int dir = 0; dir < 8; dir++) {
            int k;
            int rd = row + x[dir];
            int cd = col + y[dir];

            for (k = 1; k < n; k++) {

                if (rd >= rowLen || rd < 0 || cd >= colLen || cd < 0) {
                    break;
                }

                if (grid[rd][cd] != word.charAt(k)) {
                    break;
                }

                rd = rd + x[dir];
                cd = cd + y[dir];
            }

            if (k == n) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {

        char[][] grid = {{'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S'},
                {'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K'},
                {'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E'}};
        patternSearch(grid, "GEEKS");
        System.out.println();
        patternSearch(grid, "EEE");
    }
}
