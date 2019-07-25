package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class MinimumNumberOfSwapsRequiredToSortArrayOfDistinctElements {
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 3, 2};
        int swaps = getMinSwaps(a, a.length);
        System.out.println(swaps);
    }

    private static int getMinSwaps(int[] a, int n) {
        int count = 0;
        int i=0;

        while(i<n){
            if(a[i] == i+1){
              i++;
              continue;
            }
            int swapPosition = a[i] - 1;

            int temp = a[i];
            a[i] = a[swapPosition];
            a[swapPosition] = temp;
            count++;
        }
        return count;
    }
}
