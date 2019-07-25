package arrays;

/**
 * @author rashmi on 2019-07-02

 */
public class SumOfAllSubarrays {
    public static void main(String[] args) {
        int[] a= {10,20, 30, 40};
        findSumOfAllSubArrays(a, a.length);
    }

    private static void findSumOfAllSubArrays(int[] a, int n) {

        int[] sumsSubArray = new int[n*n];

        int sum = 0, k=0;
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=i;j<n;j++){
                sum = sum + a[j];
                sumsSubArray[k] = sum;
                k++;
            }
        }

        for(int i=0;i<n*n; i++){
            System.out.print(sumsSubArray[i]+ " ");
        }

    }
}
