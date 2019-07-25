package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class SearchAnElementInSortedRoratedArray {

    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;

        searchAnElementInSortedRotatedArray(a, key);
    }

    private static void searchAnElementInSortedRotatedArray(int[] a, int key) {
        int pivotIndex = findPivot(a, 0, a.length-1);

        int position = -1;

        if(pivotIndex == -1) {
            binarySearch(a, 0, a.length-1, key);
        }

        if(key < a[0]) {
            position = binarySearch(a, pivotIndex+1, a.length-1, key);
        }
        else {
            position = binarySearch(a, 0, pivotIndex, key);
        }
        System.out.println("position is: " + position);
    }

    private static int binarySearch(int[] a, int low, int high, int key) {

        if(low>high) {
            return -1;
        }
        if(low == high){
            return low;
        }
        int mid = (low+high)/2;

        if(key == a[mid]){
            return mid;
        }
        if(key> a[mid]) {
            return binarySearch(a, mid+1, high, key);
        }
        else {
            return binarySearch(a, low, mid-1, key);
        }
    }

    private static int findPivot(int[] a, int low, int high) {

        if(high<low) {
            return -1;
        }
        if(high == low) {
            return  low;
        }
        int mid = (low+high)/2;

        if(mid < high && a[mid] > a[mid+1]) {
            return mid;
        }
        if(mid > low && a[mid] < a[mid-1]) {
            return mid-1;
        }
        if(a[low] >= a[mid]) {
            return findPivot(a, low, mid-1);
        }
        else {
            return findPivot(a, mid+1, high);
        }
    }
}
