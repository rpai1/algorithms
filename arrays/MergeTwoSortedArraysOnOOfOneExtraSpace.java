package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class MergeTwoSortedArraysOnOOfOneExtraSpace {
    public static void main(String[] args) {
        int a1[] = new int[]{1, 5, 9, 10, 15, 20};
        int a2[] = new int[]{2, 3, 8, 13};

        mergeTwoSortedArrays(a1, a1.length, a2, a2.length);
    }

    private static void mergeTwoSortedArrays(int[] a1, int m, int[] a2, int n) {

        int last;
        int j, i;

        for(i=n-1; i>=0; i--){
            last = a1[m-1];

            for(j=m-2; j>=0 && a1[j] > a2[i]; j--){
                a1[j+1] = a1[j];
            }

            if( j != m-2 || last > a2[i] ) {
                a1[j+1] = a2[i];
                a2[i] = last;
            }
        }

        for(i=0; i<m ; i++){
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for(j=0; j<n ;j++){
            System.out.print(a2[j] + " ");
        }
    }
}
