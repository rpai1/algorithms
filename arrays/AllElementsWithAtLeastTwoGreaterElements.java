package arrays;

/**
 * @author rashmi on 2019-07-02

 */
// idea is to find the second largest element , and print all elements which are smaller than second largest element
public class AllElementsWithAtLeastTwoGreaterElements {
    public static void main(String[] args) {
        int[] a= {2, 8, 7, 1, 5};
        findAllElementsWhichHasAtLeastTwoGreaterElements(a, a.length);

    }

    private static void findAllElementsWhichHasAtLeastTwoGreaterElements(int[] a, int n) {

        int secondSmallest = findSecondSmallest(a, n);

        if(secondSmallest != -1) {
            for(int i=0;i<n; i++) {
                if(a[i]<secondSmallest) {
                    System.out.print(a[i] + " ");
                }
            }
        }

    }

    private static int findSecondSmallest(int[] a, int n) {
        int second = -1;
        int first = -1;

        for(int i=0;i<n; i++){
            if(a[i]> first && a[i] > second) {
                second = first;
                first = a[i];
            }
            else if( a[i] > second) {
                second = a[i];
            }
        }
        return second;
    }
}
