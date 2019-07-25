package arrays;

/**
 * @author rashmi on 2019-07-02

 */
public class KmaximumSumNonOverlappingContiniousSubarray {
    public static void main(String[] args) {
        int[] a = {4, 1, 1, -1, -3, -5, 6, 2, -6, -2};
        int k = 3;

        findKMaxNonVerlappingSubArray(a, a.length, k);

    }

    private static void findKMaxNonVerlappingSubArray(int[] a, int n, int k) {
        for(int c = 0; c< k ;c ++) {

           int maxEndingHere = 0;
            int maxSoFar = Integer.MIN_VALUE;
            int start = 0, end = 0, s = 0;
            for(int i=0;i<n; i++){

                maxEndingHere = maxEndingHere + a[i];

                if(maxEndingHere > maxSoFar) {
                    maxSoFar = maxEndingHere;
                    start = s;
                    end = i;
                }
                if(maxEndingHere < 0) {
                    maxEndingHere = 0;
                    s = i+1;
                }

            }
            System.out.println(maxSoFar);

            for (int l = start; l <= end; l++){
                a[l] = Integer.MIN_VALUE;
            }
        }
    }
}
