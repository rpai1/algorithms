package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class MajorityElementInASortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 10};
        int n = arr.length;
        int x = 3;

        if(isMajority(arr, n, x)){
            System.out.println(" is majority");
        }
        else {
            System.out.println(" not majority");
        }
    }

    private static boolean isMajority(int[] a, int n, int x) {

        int pos = binaySearch(a, 0, n-1, x);

        if(pos == -1){
            return  false;
        }

        if( pos < n && a[(pos + n/2)] == x){
            return  true;
        }
        else {
            return  false;
        }
    }

    private static int binaySearch(int[] a, int low, int high, int x) {

        if(low > high ){
            return  -1;
        }
        if( low == high){
            return  low;
        }
        int mid = (low+high)/2;

        if(a[mid] == x && ( a[mid-1] < x || mid == 0)) {
            return mid;
        }
        if( x > a[mid]){
            return  binaySearch(a, mid+1, high, x);
        }
        return binaySearch(a, low, mid-1, x);
    }
}
