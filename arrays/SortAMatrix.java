package arrays;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class SortAMatrix {
    public static void main(String[] args) {
        int mat[][] = { {5, 4, 7},
                {1, 3, 8},
                {2, 9, 6} };

        sortAMatrix(mat, mat.length, mat[0].length);
    }

    private static void sortAMatrix(int[][] mat, int m, int n) {

        int[] temp = new int[m*n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[k] = mat[i][j];
                k++;
            }
        }

        k=0;
        Arrays.sort(temp);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = temp[k];
                k++;
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
