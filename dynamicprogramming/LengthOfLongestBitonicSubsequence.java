package dynamicprogramming;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-23

 */
// Maximum sum bitonic subsequence is similar to this -> instead of 1, use a[i] everywhere
public class LengthOfLongestBitonicSubsequence {
    public static void main(String[] args) {
        int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5,
                13, 3, 11, 7, 15};
        int n = arr.length;
        System.out.println("Length of LBS is "+ longestBitonicSubsequence( arr, n ));
    }

    private static int longestBitonicSubsequence(int[] a, int n) {
        int[] lis = new int[n+1];
        int[] lds = new int[n+1];

        Arrays.fill(lis, 1);
        Arrays.fill(lds, 1);

        for(int i=1; i<n;i++){
            for(int j=0;j<i;j++){
                if(a[i] > a[j] && lis[i] < lis[j]+1){
                    lis[i] = lis[j]+1;
                }
            }
        }

        for(int i=n-2; i>=0; i--){
            for(int j=n-1; j>i; j--){
                if(a[i]> a[j] && lds[i] < lds[j]+1){
                    lds[i] = lds[j]+1;
                }
            }
        }

        int max =0;
        for(int i=0;i<=n;i++){
           if(lis[i] + lds[i] -1> max){
               max = lis[i] + lds[i]-1;
           }
        }

        return max;
    }
}
