package dynamicprogramming;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-23

 */
public class MaxLengthSubsequenceWhereDifferenceBetweenAdjescentsIs0Or1 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 3, 7, 6, 5, 8};
        int n = arr.length;
        System.out.println("Maximum length subsequence = "+ maxLenSub(arr, n));
    }

    private static int maxLenSub(int[] a, int n) {

        int[] mls = new int[n+1];
        Arrays.fill(mls, 1);

        for(int i=1; i<n;i++){
            for(int j=0; j<i;j++){
                if( (Math.abs(a[i]-a[j]) <=1) && mls[i] < mls[j]+1 ){
                    mls[i] = mls[j]+1;
                }
            }
        }

        int max =0;
        for(int i=0;i<=n;i++){
            if(mls[i] > max){
                max = mls[i];
            }
        }
        return max;
    }
}
