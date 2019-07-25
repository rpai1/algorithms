package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class SwapMajorDiagonalWithMinorDiagonalElementsMatrix {

    public static void main(String[] args) {
        int matrix[][] = {{0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};

        swapDiagonal(matrix, matrix.length, matrix[0].length);
    }

    private static void swapDiagonal(int[][] matrix, int m, int n) {

        for(int i=0;i<m;i++){
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][n-i-1];
            matrix[i][n-i-1] = temp;
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
