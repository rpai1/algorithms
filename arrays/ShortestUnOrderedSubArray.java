package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class ShortestUnOrderedSubArray {
    public static void main(String[] args) {
        int ar[] = {7, 9, 10, 8, 11};

        System.out.println("length of shortest unordered subarray is: " + getLengthOfShortestUnordered(ar, ar.length));
    }

    private static int getLengthOfShortestUnordered(int[] a, int n) {

        if(isIncreasing(a, n) || isDecreasing(a, n)){
            return 0;
        }
        return 3;
    }

    private static boolean isDecreasing(int[] a, int n) {
        for(int i=0;i<n-1; i++){
            if(a[i+1] > a[i]){
                return  false;
            }
        }
        return  true;
    }

    private static boolean isIncreasing(int[] a, int n) {
        for(int i=0;i<n-1; i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
}
