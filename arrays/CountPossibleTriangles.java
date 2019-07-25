package arrays;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class CountPossibleTriangles {
    public static void main(String[] args) {
        int arr[] = {10, 21, 22, 100, 101, 200, 300};
        System.out.println("Total number of triangles is " +
                findNumberOfTriangles(arr));
    }

    private static int findNumberOfTriangles(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        int count = 0;
        for(int i=0;i<n-2; ++i){
            int k = i + 2;
            for(int j=i+1; j<n; ++j){
                while(k<n && a[i] + a[j] > a[k]){
                    ++k;
                }
                if(k> j){
                    count = count + k-j-1;
                }
            }
        }
        return count;
    }
}
