package arrays;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class RearrangeEvenAndOdd {
    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 4, 7, 6, 9, 10 };
        reArrangeEvenAndOdd(a, a.length);
    }

    private static void reArrangeEvenAndOdd(int[] a, int n) {

        int count = 0;
        int temp;
        for(int i=0;i<n;i++){
            if(a[i]%2 == 0){
                temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count++;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
