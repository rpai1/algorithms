package arrays;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class MedianOfARowwiseSortedMatrix {
    public static void main(String[] args) {
        int m[][]= { {1,3,5}, {2,6,9}, {3,6,9} };
        System.out.println("Median is " + binaryMedian(m, m.length, m[0].length));

    }

    private static int binaryMedian(int[][] a, int m, int n) {

        int desired  = (m*n+1)/2;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for(int i=0;i<n;i++){
            if(a[i][0] <min ){
                min = a[i][0];
            }
        }

        for(int i=0;i<n;i++){
            if(a[i][m-1]> max){
                max = a[i][m-1];
            }
        }

        System.out.println(min);
        System.out.println(max);

        while(min < max) {
            int mid = (min + max) / 2;
            int place=0, pos = 0;

            for (int i = 0; i < m; i++) {

                pos = binarySearch(a[i], 0, n - 1, mid);

//                pos = Arrays.binarySearch(a[i],mid);
                if (pos == -1) {
                    pos = 0;
                } else {
                    while (pos < a[i].length && a[i][pos] == mid) {
                        pos++;
                    }
                }
                place = place + pos;
            }
            if(place < desired){
                min = mid+1;
            }
            else {
                max = mid;
            }
        }
        return  min;
    }

    private static int binarySearch(int[] a, int lo , int hi, int key) {

        if(lo> hi  ){
            return  -1;
        }
        if( lo == hi){
            return  lo;
        }
        int mid = (lo+hi)/2;
        if(key == a[mid]){
            return mid;
        }
        else if( key > a[mid]){
            return  binarySearch(a , mid+1, hi, key);
        }
        return binarySearch(a, lo, mid-1, key);

    }
}
