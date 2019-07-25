package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class RearrangeArrayLikeWaveForm {
    public static void main(String[] args) {
        int arr[] = { 6, 4, 2, 1, 8, 3 };
        int n = arr.length;
        rearrange(arr, n);
    }

    /*
    If index i is even, arr[i] <= arr[i+1]
If index i is odd, arr[i] >= arr[i+1]
     */
    private static void rearrange(int[] a, int n) {
      int temp;

      for(int i=0;i<n-1;i++){
          if(i%2 == 0 && a[i] > a[i+1]){
              temp = a[i];
              a[i] = a[i+1];
              a[i+1] = temp;
          }
          if(i%2 != 0 && a[i] < a[i+1]) {
              temp = a[i];
              a[i] = a[i+1];
              a[i+1] = temp;
          }
      }

      for(int i=0;i<n; i++){
          System.out.print(a[i] + " ");
      }
    }
}
