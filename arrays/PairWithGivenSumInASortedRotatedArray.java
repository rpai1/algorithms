package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class PairWithGivenSumInASortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        findPairWithGivenSum(arr, sum);
    }

    private static void findPairWithGivenSum(int[] a, int sum) {
        int pivot = findPivot(a, 0, a.length-1);

        int right = pivot;
        int left = pivot+1;
        System.out.println(pivot);

        while(right!=left) {
            if(a[left] + a[right] == sum) {
                System.out.println(a[left] + " " + a[right] + "  ");
                return;
            }
            if(a[left] + a[right]< sum ) {
                left = (left+1)%a.length;
            }
            else if(a[left] + a[right] > sum) {
                right = ( a.length + right-1)%a.length;
            }
        }
    }

    private static int findPivot(int[] a, int low, int high) {
        if(low>high){
            return -1;
        }
        if(low == high) {
            return  low;
        }
        int mid = (low+high)/2;

        if(mid<high && a[mid] > a[mid+1]){
            return mid;
        }
        if(mid>low && a[mid] < a[mid-1]){
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
