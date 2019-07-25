package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 9, 10};
        int element = 7;
        int pos = binarySearch(a, 0, a.length-1, element);
        System.out.println(pos+1);
    }

    private static int binarySearch(int[] a, int low, int high, int key) {

        if( low > high) {
            return -1;
        }
        if( low == high) {
            return  low;
        }

        int mid = (low + high)/2;
        if( key == a[mid]){
            return  mid;
        }
        if(key > a[mid]){
            return binarySearch(a, mid+1, high, key);
        }
        return binarySearch(a, low, mid-1, key);
    }
}
