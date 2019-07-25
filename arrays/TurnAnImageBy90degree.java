package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class TurnAnImageBy90degree {
    public static void main(String[] args) {

        int m[][] =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12}
                };

        rotateBy90Degree(m, m.length, m[0].length);

    }

    private static void rotateBy90Degree(int[][] a, int rowLen, int colLen) {

        int[][] newM = new int[colLen][rowLen];
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                newM[j][rowLen-i-1] = a[i][j];
            }
        }

        for(int i=0;i<colLen;i++){
            for(int j=0;j<rowLen; j++){
                System.out.print(newM[i][j] + " ");
            }
            System.out.println();
        }

    }
}
