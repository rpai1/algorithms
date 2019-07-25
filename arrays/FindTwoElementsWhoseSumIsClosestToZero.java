package arrays;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class FindTwoElementsWhoseSumIsClosestToZero {
    public static void main(String[] args) {
        int[] a = {1, 60, -10, 70, -80, 85};
        findTwoElements(a, a.length);
    }

    private static void findTwoElements(int[] a, int n) {
        int minSum = Integer.MAX_VALUE;
        Arrays.sort(a);

        int i=0;
        int j= n-1;
        int sum;
        int index1 = -1, index2 = -1;
        while(i<j){
            sum = a[i] + a[j];
            if(Math.abs(sum)< Math.abs(minSum)){
                minSum = sum;
                index1 = i;
                index2 = j;
            }
            if(sum < 0){
                i++;
            }
            else {
                j --;
            }

        }

        System.out.println(a[index1] + " " + a[index2]);

    }
}
