package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class CountMinimumStepsToReachTarget {
    public static void main(String[] args) {
        int[] arr = {2, 3};
        int steps = countStepsToReachArray(arr, arr.length);
        System.out.println(steps);
    }

    private static int countStepsToReachArray(int[] a, int n) {

        int result = 0;

        while (true) {
            int zeroCount = 0;
            int i;
            for(i=0;i<n;i++){
                if(a[i]%2 != 0){
                    break;
                }
                else if(a[i] == 0){
                    zeroCount ++;
                }
            }
            if(zeroCount == n) {
                return result;
            }

            for(int j=i; j<n; j++){
                if(a[j]% 2 !=0) {
                    a[j]--;
                    result++;
                }
            }
            if(i == n) {
                for(int j=0;j<n; j++){
                    a[j] = a[j]/2;
                }
                result ++;
            }
        }

    }
}
