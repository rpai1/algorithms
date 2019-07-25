package arrays;

/**
 * @author rashmi on 2019-07-02

 */
public class ThreeLargest {
    public static void main(String[] args) {
        int[] a = {12, 13, 1, 10, 34, 1};
        findThreeLargest(a, a.length);
    }

    private static void findThreeLargest(int[] a, int n) {
        int first = -1;
        int second = -1;
        int third = -1;
        for( int i=0;i<n; i++) {
            if(a[i] > first && a[i]> second && a[i] > third) {
                third = second;
                second = first;
                first = a[i];

            }
            else if ( a[i] > second && a[i] > third) {
                third = second;
                second = a[i];
            }
            else  if(a[i] > third){
                third = a[i];
            }
        }
        System.out.println(first + " " + second + " " + third);
    }
}
