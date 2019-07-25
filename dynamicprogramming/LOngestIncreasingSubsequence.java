package dynamicprogramming;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-23

 */
//https://www.geeksforgeeks.org/maximum-length-chain-of-pairs-dp-20/ Check this.. this is variation of LIS asked in amazon..
    // only change we need to do is if(a[i].a > a[j].b) !!
// another variation -> elements need to be removed to convert an array to strictly increasing array https://www.geeksforgeeks.org/convert-to-strictly-increasing-integer-array-with-minimum-changes/
public class LOngestIncreasingSubsequence {

    private static int lis(int[] a, int n) {

        int[] lis = new int[n + 1];

        for (int i = 0; i < n; i++)
            lis[i] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

//        System.out.println(Arrays.toString(lis));
        int max = lis[0];
        System.out.print(a[0]+ " ");
        for (int i = 1; i <n; i++) {
            if(lis[i] >= lis[i+1]){
                System.out.print(a[i]+ " ");
            }
            if (lis[i] > max) {
                max = lis[i];
            }
        }
        System.out.println( " are the elements in the input array which participated in the sequence");
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        System.out.println("Length of lis is " + lis(arr, n) + "\n");
    }
}
