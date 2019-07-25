package dynamicprogramming;

/**
 * @author rashmi on 2019-07-23

 */
//also contains MinPAthSumTriangle
public class MaxPathSumTriangle {
    public static void main(String[] args) {
        {
            int tri[][] = { {1, 0, 0},
                    {4, 8, 0},
                    {1, 5, 3} };
            System.out.println ( maxPathSum(tri, 2, 2));

             int a[][] = {{2,0, 0},
                         {3, 9, 0},
                         {1, 6, 7}};
            System.out.println ( minPathSum(a, 2, 2));
        }
    }

    private static int minPathSum(int[][] a, int m, int n) {
        for(int i=m-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                if(a[i+1][j] < a[i+1][j+1]){
                    a[i][j] = a[i][j]+ a[i+1][j];
                }
                else {
                    a[i][j] = a[i][j] + a[i+1][j+1];
                }
            }
        }
        return a[0][0];
    }

    private static int maxPathSum(int[][] a, int m, int n) {

        for(int i=m-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                if(a[i+1][j] > a[i+1][j+1]){
                    a[i][j] = a[i][j]+ a[i+1][j];
                }
                else {
                    a[i][j] = a[i][j] + a[i+1][j+1];
                }
            }
        }

        return a[0][0];
    }
}
