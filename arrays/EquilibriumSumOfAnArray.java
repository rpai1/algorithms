package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class EquilibriumSumOfAnArray {
    public static void main(String[] args) {
        int[] a= { -2, 5, 3, 1, 2, 6, -4, 2 };
        int sum = findEqulibriumSum(a, a.length);
        System.out.println(sum);
    }

    private static int findEqulibriumSum(int[] a, int n) {

        int sum = 0;
        int res = Integer.MIN_VALUE;
        int prefixSuum =0;
        for(int i=0; i<n; i++){
            sum = sum + a[i];
        }

        for(int i = 0; i< n; i++) {
         prefixSuum = prefixSuum + a[i];

         if(prefixSuum == sum){
             res = Math.max(res, prefixSuum);
         }
         sum = sum - a[i];
        }
        return  res;
    }
}
