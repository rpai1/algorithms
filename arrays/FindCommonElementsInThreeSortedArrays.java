package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class FindCommonElementsInThreeSortedArrays {
    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        findCommon(ar1, ar2, ar3, ar1.length, ar2.length, ar3.length);
    }

    private static void findCommon(int[] a, int[] b, int[] c, int m, int n, int o) {

        int i=0, j=0, k=0;

        while(i<m && j<n && k<o){
            if(a[i] == b[j] && b[j] == c[k]) {
                System.out.println(a[i] + " ");
                i++;
                j++;
                k++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else if( b[j] < c[k]){
                j++;
            }
            else {
                k++;
            }
        }
    }
}
