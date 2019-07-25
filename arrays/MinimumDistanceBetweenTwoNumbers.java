package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class MinimumDistanceBetweenTwoNumbers {
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int x = 3;
        int y = 6;
        int dist =findMinimumDistance(a, a.length, x, y);
        System.out.println(dist);
    }

    private static int findMinimumDistance(int[] a, int n, int x, int y) {

        int prev = 0;
        int i;
        int minDist = Integer.MAX_VALUE;
        for(i=0; i<n;i++){
            if(a[i] == x || a[i] == y) {
                prev = i;
                break;
            }
        }
        for(; i<n;i++){
            if(a[i] == x || a[i] == y) {
                if(a[prev] != a[i] && i-prev < minDist ){
                    minDist = i-prev;
                    prev = i;
                }
                else {
                    prev = i;
                }
            }
        }

        return minDist;
    }
}
