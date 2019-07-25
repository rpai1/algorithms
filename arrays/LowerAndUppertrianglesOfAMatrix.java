package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class LowerAndUppertrianglesOfAMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        printLowerAndUpperTriangles( matrix, matrix.length, matrix[0].length);
    }

    private static void printLowerAndUpperTriangles(int[][] a, int m, int n) {

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i >j){
                    System.out.print( "0" + " ");
                }
                else System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i <j){
                    System.out.print( "0" + " ");
                }
                else System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
