package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class PrintMatrixInSprialForm {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 } };

        printMatrixInSprialForm(a, a.length, a[0].length);
    }

    private static void printMatrixInSprialForm(int[][] a, int m, int n) {

        int row = 0;
        int col =0;

        while(row<m && col < n){

            if(row + 1== m || col +1 == n){
                break;
            }

            for(int i=col; i<n; i++){
                System.out.print(a[row][i] + " ");
            }
            row ++;

            for( int i= row; i<m; i++){
                System.out.print(a[i][n-1] + " ");
            }

            n--;

            for(int i=n-1; i>=col;i--){
                System.out.print(a[m-1][i] + " ");
            }

            m--;

            for(int i=m-1; i>=row;i--){
                System.out.print(a[i][col] + " ");
            }
            col ++;
        }
    }
}
