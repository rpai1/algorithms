package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class RotateAMatrixClockwise {
    public static void main(String[] args) {
        int[][] a = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };

        rotateMatrix(a , a[0].length, a.length);
    }

    private static void rotateMatrix(int[][] a, int m, int n) {

        int row = 0;
        int col =0;
        int i;
        int cur;

        while(row<m && col < n){

            if(row+ 1 == m || col+1 == n){
                break;
            }
            // first row;
            int prev = a[row+1][col];

            for(i=col; i<n ; i++){

                cur = a[row][i];
                a[row][i] = prev;
                prev = cur;
            }
            row ++;

            //last  col
            for( i = row; i<m ;i++){

                cur = a[i][n-1];
                a[i][n-1] = prev;
                prev  = cur;
            }
            n--;

            // last row
            for( i = n-1 ; i>=col; i--) {
                cur = a[m-1][i];
                a[m-1][i] = prev;
                prev = cur;

            }
            m--;

            //first col
            for( i = m-1; i>=row; i--){
                cur = a[i][col];
                a[i][col] = prev;
                prev = cur;
            }
            col++;
        }

        for( i=0;i<a.length ;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

    }
}
