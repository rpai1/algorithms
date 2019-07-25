package arrays;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author rashmi on 2019-07-02

 */
public class MedianOfAStream {

    public static void main(String[] args) {
        int[] a = {41, 35, 62, 4, 97, 102};
        findMedian(a);
    }

    private static void findMedian(int[] a) {

        PriorityQueue<Integer> lo = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> hi = new PriorityQueue<>();
        for(int i=0; i< a.length; i++) {
            addNumber(lo, hi, a[i]);
        }
    }

    private static void addNumber(PriorityQueue<Integer> lo, PriorityQueue<Integer> hi, int element) {
        lo.add(element);
        hi.add(lo.poll());

        if(lo.size() < hi.size()) {
            lo.add(hi.poll());
        }
        findMedian(lo, hi);
    }

    private static void findMedian(PriorityQueue<Integer> lo, PriorityQueue<Integer> hi) {
        int median;
        if(lo.size() > hi.size()) {
            System.out.println(lo.peek());
        }
        else {
            median = (lo.peek() + hi.peek())/2;
            System.out.println(median);
        }
    }
}
