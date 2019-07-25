package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class ShiftMatrixRowwiseByK {
    public static void main(String[] args) {
        int[][] mat = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };
        int k= 2;

        shiftRowWise(mat, mat.length, mat[0].length, k);
    }

    private static void shiftRowWise(int[][] mat, int m, int n, int k) {

        for(int i=0;i<m;i++){
            if(m%2 == 0) {
                mat[i] = shiftByK(mat[i], k);
            }
            else {
                mat[i] = shiftByK(mat[i], k-1);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] shiftByK(int[] a,  int k) {

        for(int i=0;i<a.length;i++){
            int temp = a[i];
            a[i] = a[i%k];
            a[i%k] = temp;
        }
        return a;
    }
}
