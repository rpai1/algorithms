package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class MinimumNumberOfJumpsToReachEnd {
    public static void main(String[] args) {
        int[] a= {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};

        int minJUmps = findMinJumpsRecursion(a,0, a.length);
        System.out.println(minJUmps);

    }

    private static int findMinJumpsRecursion(int[] a, int l, int h) {

        if(h == l){
            return 0;
        }
        // if element is 0, then nothing is reachable, given condition
        if(a[l] == 0) {
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;
        for(int i=l+1; i<=h  && i<= l+a[l]; i++){
            int jumps  = findMinJumpsRecursion(a, i, h);
            if(jumps != Integer.MAX_VALUE && jumps+1 < min){
                min = jumps+1;
            }
        }

        return min;
    }
}
