package arrays;

/**
 * @author rashmi on 2019-07-05

 */
// You can only move dowm and diagonally left or right
public class MaximumPathSumInAMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 10, 10, 2, 0, 20, 4 },
                { 1, 0, 0, 30, 2, 5 },
                { 0, 10, 4, 0, 2, 0 },
                { 1, 0, 2, 20, 0, 4 }
        };

        int sum = findMaximumPathSum(mat, mat.length, mat[0].length);
        System.out.println(sum);
    }

    private static int findMaximumPathSum(int[][] mat, int m, int n) {
        int res = -1;

        for(int i=0;i<n;i++){
            res = Math.max(res, mat[0][i]);
        }

        for(int i=1; i<m; i++){
            res = -1;
            for(int j=0;j<n;j++){

                // all paths possible down + left + right
                if(j > 0 && j < n-1){
                    mat[i][j] = mat[i][j] + Math.max(Math.max(mat[i-1][j], mat[i-1][j-1]), mat[i-1][j+1]);
                }

                // no right
                else if( j > 0){
                    mat[i][j] = mat[i][j] + Math.max(mat[i-1][j], mat[i-1][j-1]);
                }
                //no left
                else if( j < n-1){
                    mat[i][j] = mat[i][j] + Math.max(mat[i-1][j], mat[i-1][j+1]);
                }
                res = Math.max(res, mat[i][j]);
            }
        }
        return  res;
    }
}
