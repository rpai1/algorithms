package arrays;

/**
 * @author rashmi on 2019-07-04

 */
/*
the array should be sorted
 */
public class FindFixedPointInAnArray {
    public static void main(String[] args) {
        int[] a={-10, -1, 0, 3 , 10, 11, 30, 50, 100};
        int point = findFixedPointBinarySearch(a, 0, a.length-1);
        System.out.println(point);
    }

    private static int findFixedPointBinarySearch(int[] a, int lo, int hi) {

        if(hi >= lo){
            int mid = (lo+hi)/2;
            if(a[mid] == mid){
                return  mid;
            }
            if( a[mid] > mid){
                return findFixedPointBinarySearch(a, lo, mid-1);
            }
            return findFixedPointBinarySearch(a, mid+1, hi);
        }
        return  -1;
    }
}
