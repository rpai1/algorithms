package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class MultipleLeftRotationsOfAnArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;

        int k = 2;
        leftRotate(arr, n, k);
        System.out.println();

        k = 3;
        leftRotate(arr, n, k);
        System.out.println();

        k = 4;
        leftRotate(arr, n, k);
        System.out.println();
    }

    private static void leftRotate(int[] arr, int n, int k) {
        for(int i= k; i<n+k; i++){
            System.out.print( arr[i%n] + " " );
        }
    }
}
