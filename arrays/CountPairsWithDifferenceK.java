package arrays;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class CountPairsWithDifferenceK {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 2};
        int k = 3;
        int c = countPairs(arr, arr.length, k);
        System.out.println(c);
    }

    private static int countPairs(int[] a, int n, int k) {

        Arrays.sort(a);
        int count=0;

        int l= 0;
        int r= 0;
        while(r<n){
            if(a[r] - a[l] == k){
                l++;
                r++;
                count++;
            }
            else if(a[r]-a[l] > k){
                l++;
            }
            else if(a[r] - a[l] < k){
                r++;
            }

        }
        return count;
    }
}
