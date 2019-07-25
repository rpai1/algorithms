package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class SmallestPositiveIntegerThatCanNotBeRepresentedAsSumOfAnySubSet {

    public static void main(String[] args) {
        int[] a= {1, 1, 3, 4};
        int small = findSmallestInteger(a, a.length);
        System.out.println(small);
    }

    private static int findSmallestInteger(int[] a, int n) {
        int res = 1;
        for(int i=0; i<n && a[i]<= res; i++) {
            res = res + a[i];
        }
        return res;
    }
}
