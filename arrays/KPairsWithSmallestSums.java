package arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author rashmi on 2019-07-02

 */
public class KPairsWithSmallestSums {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 11};
        int[] a2 = {2, 4, 8};
        int k = 3;

        findKPairsWithSmallestSum(a1, a2, a1.length, a2.length, k);
    }

    private static void findKPairsWithSmallestSum(int[] a, int[] b, int m, int n, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        int sum = 0, count = 0;
        maxHeap.add(Integer.MIN_VALUE);
        for(int i=0;i<m; i++) {
            for( int j=0; j<n; j++) {
                sum = a[i] + b[j];
                if(maxHeap.size() > k) {
                    maxHeap.poll();
                }
                if( sum > maxHeap.peek() && maxHeap.size() <=k){
                    maxHeap.add(sum);
                    System.out.println(a[i] + " " + b[j]);
                }
            }
            if( count == k) {
                break;
            }
        }
    }
}
