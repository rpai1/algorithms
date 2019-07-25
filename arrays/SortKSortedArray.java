package arrays;

import java.util.PriorityQueue;

/**
 * @author rashmi on 2019-07-03

 */

/*
The idea is to first insert k elements  to min heap
then for the rest of ethe elements
start traversing i from k
for each i, poll from heap, update array and add new element to heap.
This makes sure all the elements from heap are updated to array in sorted manner
 */
public class SortKSortedArray {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 12, 56, 8 };
        int k = 3;
        mergeKNearlySorted(arr, arr.length, k);
    }

    private static void mergeKNearlySorted(int[] a, int n, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k+1);

        for(int i=0;i<=k;i++){
            minHeap.add(a[i]);
        }

        int index = 0;
        for(int i=k+1;i<n;i++){
            a[index] = minHeap.peek();
            index++;
            minHeap.poll();
            minHeap.add(a[i]);
        }

        while(!minHeap.isEmpty()) {
            a[index] = minHeap.peek();
            minHeap.poll();
            index++;
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
