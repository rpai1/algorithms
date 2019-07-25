package arrays;

import java.util.PriorityQueue;

/**
 * @author rashmi on 2019-07-02

 */
public class KThLargestSumContigiousSubArray {
    public static void main(String[] args) {
        int[] a = {20, -5, -1};
        int k = 3;

        findKthLargestSum(a, a.length, k);
    }

    private static void findKthLargestSum(int[] a, int n, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int count = 0;
        for(int i=0;i<n;i++) {
            int sum = 0;
            for(int j=i;j<n;j++) {
                sum = sum+ a[i];
                if(count<k) {
                    heap.add(sum);
                    count++;
                }
                else {
                    if(sum > heap.peek()) {
                        heap.poll();
                        heap.add(sum);
                    }
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(heap.peek());
        }
        System.out.println(heap.peek());
    }
}
