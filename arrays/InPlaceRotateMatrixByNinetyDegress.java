package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class InPlaceRotateMatrixByNinetyDegress {

    public static void main(String[] args) {
        int N = 4;

        // Test Case 1
        int m[][] =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                };

        inPlaceRotate(m , N);

        int n[][] =
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][]o = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println();

        inPlaceRotateMethod2(n ,N);

        System.out.println();
        rotateMatrixBy180Degree(o, N);
    }

    // To rotate matrix by 180, do what you would do for 90 twice
    private static void rotateMatrixBy180Degree(int[][] a, int n) {
        transforce(a,n);
        reverseColumns(a, n);
        transforce(a, n);
        reverseColumns(a, n);
        printMatrix(a, n);
    }

    private static void inPlaceRotateMethod2(int[][] a, int n) {

        transforce(a, n);
        reverseColumns(a,n);
        printMatrix(a, n);

    }

    private static void reverseColumns(int[][] a, int n) {
        for(int i=0;i<n;i++){
            for(int j=0, k=n-1; j<k ; j++, k--){
                int temp = a[j][i];
                a[j][i] = a[k][i];
                a[k][i] = temp;
            }
        }
    }

    private static void transforce(int[][] a, int n) {
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = a[j][i];
                a[j][i] = a[i][j];
                a[i][j] = temp;
            }
        }
    }

    private static void inPlaceRotate(int[][] a, int n) {

        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {

                int temp = a[i][j];
                a[i][j] = a[j][n - 1 - i];
                a[j][n - 1 - i] = a[n - 1 - i][n - 1 - j];
                a[n - 1 - i][n - 1 - j] = a[n - 1 - j][i];
                a[n - 1 - j][i] = temp;
            }
        }
        printMatrix(a, n);
    }

    private static void printMatrix(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
