package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class MatrixMultiplication {
    public static void main(String[] args) {

        int m1[][] = { {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};

        int m2[][] = { {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};

        multiply(m1, m2);
    }

    private static void multiply(int[][] m1, int[][] m2) {

        int m1Row = m1.length;
        int m1Col = m1[0].length;
        int m2Row = m2.length;
        int m2Col = m2[0].length;

        if(m1Col != m2Row){
            System.out.println(" not possible to multiply");
            return;
        }

        int[][] c = new int[m1Col][m2Row];

        for(int i=0;i<m1Row;i++){
            for(int j=0;j<m2Col;j++){
                c[i][j] = 0;
                for(int k=0; k<m1Col;k++){
                    c[i][j] = c[i][j] + m1[i][k]*m2[k][j];
                }
            }
        }


        for(int i=0;i<m2Col;i++){
            for(int j=0;j<m2Col;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
