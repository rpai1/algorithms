package arrays;

/**
 * @author rashmi on 2019-07-02

 */
public class KThSmallestElementUsingPartitionFunctionOfQuickSort {
    public static void main(String[] args) {
        int[] a = {12, 3, 5, 7, 4, 19, 26};
        int k= 3;
        findKthSmallest(a, a.length, k, 0, a.length-1);
    }

    private static void findKthSmallest(int[] a, int n, int k ,int low, int high) {

        int pos = partition(a, low, high);

        if(pos == k){
            System.out.println(a[pos+1]);
        }
        else if( k < pos+1) {
            findKthSmallest(a ,n,k,0, pos-1);
        }
        else {
            findKthSmallest(a,n,k, pos+1, n-1);
        }
    }

    private static int partition(int[] a, int left, int right) {

        int start = left;
        int end = right;
        int pivot = a[right];
        while(true) {
            while (left < right && a[left] < pivot) {
                left++;
            }
            while (right > left && a[right] >= pivot) {
                right--;
            }
            if (left == right) {
                break;
            }
            swap(a, left, right);
        }
        swap(a, left, end);
        return left;
    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }


}
