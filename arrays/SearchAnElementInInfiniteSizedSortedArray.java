package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class SearchAnElementInInfiniteSizedSortedArray {
    public static void main(String[] args) {
        int[] a= {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};

        int ele = 170;

        searchElement(a, ele);
    }

    private static void searchElement(int[] a, int ele) {
        int low = 0;
        int high = 1;
        int value = a[0];
        while( value < ele) {
            low = high;
             if(2*high < a.length) {
                 high = 2*high;
             }
             else {
                 high = a.length-1;
             }

             value = a[high];
        }

        int pos = binarySeach( a, low, high, ele);
        System.out.println(pos);
    }

    private static int binarySeach(int[] a, int low, int high, int ele) {
        if( low > high){
            return -1;
        }
        if( low == high) {
            return  low;
        }
        int mid = (low+high)/2;
        if( ele == a[mid]){
            return  mid;
        }
        if( ele > a[mid]) {
            return binarySeach(a, mid+1, high, ele);
        }
        return binarySeach(a, low, mid-1, high);
    }
}
