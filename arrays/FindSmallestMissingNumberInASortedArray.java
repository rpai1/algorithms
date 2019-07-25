package arrays;

/**
 * @author rashmi on 2019-07-02

 */
public class FindSmallestMissingNumberInASortedArray {
    public static void main(String[] args) {
        int[] a= {0, 1, 2, 3, 4, 5, 6, 7, 10};
        int n =findSmallestMissingNumber(a, 0, a.length);
        System.out.println(n);
    }

    private static int findSmallestMissingNumber(int[] a, int low, int high) {

        if(low > high) {
            return high+1;
        }
        if(low != a[low]) {
            return low;
        }
        int mid = (low+high)/2;

        if(a[mid] == mid ) {
            return findSmallestMissingNumber(a, mid+1, high);
        }
        else {
            return findSmallestMissingNumber(a, low, mid-1);
        }

    }
}
