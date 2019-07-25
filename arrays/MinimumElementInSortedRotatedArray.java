package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class MinimumElementInSortedRotatedArray {
    public static void main(String[] args) {
        int[] a = {7, 9, 11, 12, 15};
        int min = findMinimumElement(a);
        int rotations = findNumberOfRotations(a);
        System.out.println(" Min element in sorted rotated array is: " +min);
        System.out.println(" Number of times array is rotated is: " +rotations);
    }

    private static int findNumberOfRotations(int[] a) {
        int pivot = findPivot(a, 0, a.length-1);
        if(pivot == -1){
            return 0;
        }
        else return pivot+1%a.length;
    }

    private static int findMinimumElement(int[] a) {
        int pivot = findPivot(a, 0, a.length-1);
        if(pivot == -1) {
            return a[0];
        }
        else {
            return a[(pivot+1)%a.length];
        }
    }

    private static int findPivot(int[] a, int low, int high) {
        if(low>=high) {
            return -1;
        }
        if(low==high){
            return low;
        }
        int mid = (low+high)/2;

        if(mid<high && a[mid] > a[mid+1]){
            return mid;
        }
        if(mid>low && a[mid] < a[mid-1]) {
            return mid-1;
        }
        if(a[low]>=a[mid]){
            return findPivot(a, low, mid-1);
        }
        else {
            return findPivot(a, mid+1, high);
        }
    }
}
