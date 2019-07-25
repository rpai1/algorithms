package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class CountInversionsMergeSort {
    public static void main(String[] args) {
        int[] a= { 1, 20, 6, 4, 5 };
        int[] temp = new int[a.length];
        int c = countInversionsMergeSort(a, temp, 0, a.length);
        System.out.println(c);
    }

    private static int countInversionsMergeSort(int[] a, int[] temp, int lo, int hi) {

        int invCount = 0;
        if(hi   > lo){
            int mid = (lo + hi)/2;
            invCount = countInversionsMergeSort(a, temp, lo, mid);
            invCount = invCount + countInversionsMergeSort(a, temp, mid+1, hi);
            invCount = invCount + merge(a, temp, lo, mid+1, hi);
        }
        return invCount;
    }

    private static int merge(int[] a, int[] temp, int lo, int mid, int hi) {
        int invCount = 0;
        int i=lo, j=mid, k=lo;
        while(i<mid && j<hi){
            if(a[i]<=a[j]){
                temp[k] = a[i];
                i++;
                k++;
            }
            else {
                temp[k] = a[j];
                j++;
                k++;
                invCount = invCount + mid-i;
            }
        }

        while(i<mid){
            temp[k] = a[i];
            i++;
            k++;
        }
        while(j<hi){
            temp[k] = a[j];
            j++;
            k++;
        }

        for (i = lo; i < hi; i++)
            a[i] = temp[i];
        return invCount;
    }
}
