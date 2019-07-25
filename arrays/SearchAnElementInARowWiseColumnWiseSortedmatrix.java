package arrays;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;

class SearchAnElementInARowWiseColumnWiseSortedmatrix{
    private static void search(int[][] a, int n, int key){
        int i=0;
        int j= n-1;

        while(i<n && j>=0){
            if(a[i][j] == key){
                System.out.println(i + " "+j);
                return;
            }
            else if( key < a[i][j]){
                j--;
            }
            else {
                i++;
            }
        }

    }

    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        search(mat, 4, 29);
    }
}


