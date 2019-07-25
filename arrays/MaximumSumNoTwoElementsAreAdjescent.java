package arrays;

/**
 * @author rashmi on 2019-07-02

 */
// similar to: https://www.geeksforgeeks.org/maximum-sum-2-x-n-grid-no-two-elements-adjacent/
public class MaximumSumNoTwoElementsAreAdjescent {
    public static void main(String[] args) {
        int[] a = {5, 5, 10, 100, 10, 5};
        findMaximumSum(a, a.length);
    }

    private static void findMaximumSum(int[] a, int n) {

        int incl = a[0];
        int excl = 0;
        int excl_new;

        for(int i=1;i<n; i++) {

            // exclude
            excl_new = incl > excl ? incl : excl;

            // include
            incl = excl + a[i];
            excl = excl_new;
        }

        System.out.println(incl > excl ? incl : excl);
    }
}
