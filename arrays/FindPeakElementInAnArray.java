package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class FindPeakElementInAnArray {
    public static void main(String[] args) {
        int a[] = {1, 3, 20, 4, 1, 0};

        int peak = findPeakBinarySearch(a, 0, a.length-1, a.length);
        System.out.println(peak);
    }

    private static int findPeakBinarySearch(int[] a, int low, int high, int n) {

        int mid = (low+high)/2;

        if((mid == 0 || a[mid] > a[mid-1]) && (mid == n-1 || a[mid] > a[mid+1]) ){
            return a[mid];
        }
        if(mid > 0 && a[mid-1] > a[mid]){
            return findPeakBinarySearch(a, low, mid-1, n);
        }
        return findPeakBinarySearch(a, mid+1, high, n);
    }
}
