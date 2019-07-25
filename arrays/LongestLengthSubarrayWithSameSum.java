package arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rashmi on 2019-07-03

 */
public class LongestLengthSubarrayWithSameSum {
    public static void main(String args[])
    {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1, 1, 0, 1};
        int n = arr1.length;
        System.out.println(longestCommonSum(arr1, arr2, n));
    }

    private static int longestCommonSum(int[] a, int[] b, int n) {

        int[] c = new int[n];
        for(int i=0;i<n;i++){
            c[i] = a[i]- b[i];
        }

        int sum=0;
        int maxLength = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        for(int i=0;i<n;i++){
            sum = sum + c[i];

            if(sum == 0){
              maxLength = i+1;
            }

            if(sumMap.containsKey(sum)){
                maxLength = Math.max(maxLength, i-sumMap.get(sum));
            }
            sumMap.put(sum, i);

        }
        return maxLength;
    }
}
