package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class RowWithMaximumNumberOfOnes {
    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };

        int rowWithMaxOnes = findRowsWithMaxOnes(mat, mat.length, mat[0].length);
        System.out.println(rowWithMaxOnes+1);
    }

    private static int findRowsWithMaxOnes(int[][] mat, int m, int n) {

        int maxRowWithMaxOnes = -1;
        int maxRowIndex = -1;

        for(int i=0;i<m;i++){
            int numberOfOnesStaringIndex = binarySearchOnes(mat[i], 0, n-1);
            int numberOfOnes = n-numberOfOnesStaringIndex;
            if(numberOfOnes != -1 && numberOfOnes > maxRowWithMaxOnes){
                maxRowWithMaxOnes = numberOfOnes;
                maxRowIndex = i;
            }
        }
        return  maxRowIndex;
    }

    private static int binarySearchOnes(int[] a, int low, int high) {
        if(high <low){
            return  -1;
        }
        if(high == low){
            return low;
        }
        int mid = (low+high)/2;
        if((mid == 0  && a[mid] == 1) || (a[mid-1] == 0 && a[mid] ==1)) {
            return mid;
        }
        if(a[mid] ==0) {
            return binarySearchOnes(a, mid+1, high);
        }
        return binarySearchOnes(a, low, mid-1);
    }
}
