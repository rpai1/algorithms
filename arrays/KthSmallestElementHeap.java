package arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author rashmi on 2019-07-02

 */
public class KthSmallestElementHeap {

    public static void main(String[] args) {
        int[] a = {3,2,1,5,6,4};
        int k = 3;
        findKthSmallestUsingMinHeap(a, a.length, k);
        findKthSmallestUsingMaxHeap(a, a.length, k);
    }

    private static void findKthSmallestUsingMinHeap(int[] a, int n, int k) {
       PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
       for(int i=0;i<n;i++){
           if(minHeap.size() > k) {
               minHeap.poll();
           }
           minHeap.add(a[i]);
       }
        System.out.println(minHeap.peek());
    }

    private static void findKthSmallestUsingMaxHeap(int[] a, int n, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int i=0;i<n;i++){
            maxHeap.add(a[i]);

            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        System.out.println(maxHeap.peek());
    }
}
