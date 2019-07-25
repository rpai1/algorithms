package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class IncrementByKOperationsToMakeAllElementsEqual {
    public static void main(String[] args) {
        int[] a= {4, 7, 19, 16};
        int k= 3;

        int m = getNumberOfOperationsToMakeAllElementsEqualByIncrementingByK(a, a.length, k);
        System.out.println(m);
    }

    private static int getNumberOfOperationsToMakeAllElementsEqualByIncrementingByK(int[] a, int n, int k) {

        int max = Integer.MIN_VALUE;
        for( int i=0;i<n; i++){
            if( a[i] > max){
                max = a[i];
            }
        }
        int res = 0;
        for(int i=0;i<n;i++){
            if(((max-a[i])%k) !=0){
                return -1;
            }
            else
                res = res + ((max-a[i])/k);
        }

        return res;
    }
}
