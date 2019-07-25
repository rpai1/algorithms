package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class RotateAMatrixAntiClockWise {

    public static void main(String[] args) {
        int[][] a = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };

//        int[][] a = {{1, 2,3},
//                {4, 5,6},
//                {7 , 8 ,9}};
        rotateAMatrix(a, a[0].length, a.length);
    }

    private static void rotateAMatrix(int[][] a, int m, int n) {

        int row=0, col=0,i, cur;

        int prev = a[row+1][n-1];

        while(row< m && col< n){

            prev = a[row+1][n-1];

            if(row+1 == m && col+1 == n){
                break;
            }

            for( i = n-1; i>=row; i--){
               cur = a[row][i];
               a[row][i] = prev;
               prev = cur;
            }
            row ++;

            for( i = row; i<m ; i++) {
                cur = a[i][col];
                a[i][col] = prev;
                prev = cur;
            }
            col++;

            for(i = col; i<n; i++) {
                cur = a[m-1][i];
                a[m-1][i] = prev;
                prev = cur;
            }
            m--;

            for(i= m-1; i>=col; i--) {
                cur = a[i][n-1];
                a[i][n-1] = prev;
                prev = cur;
            }
            n--;
        }
        for( i=0; i<a.length; i++){
            for( int j=0; j< a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
