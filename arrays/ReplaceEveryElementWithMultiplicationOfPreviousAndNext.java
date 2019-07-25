package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class ReplaceEveryElementWithMultiplicationOfPreviousAndNext {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        replace(arr, arr.length);

    }

    private static void replace(int[] a, int n) {

        int prev = a[0];
        a[0] = a[0]*a[1];
        int cur;

        for(int i=1; i<n-1; i++){
            cur = a[i];
            a[i] = prev*a[i+1];
            prev=cur;
        }
        a[n-1] = prev*a[n-1];
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
