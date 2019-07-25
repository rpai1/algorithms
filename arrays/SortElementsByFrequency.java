package arrays;

import java.util.*;

/**
 * @author rashmi on 2019-07-03

 */
public class SortElementsByFrequency {
    public static void main(String[] args) {
        int[] a = {2, 5, 2, 8, 5, 6, 8, 8};
        sortElementsByFrequency(a, a.length);
    }

    private static void sortElementsByFrequency(int[] a, int n) {

        Map<Integer, Integer> freqMap = new TreeMap<>();

        for(int i=0;i<n;i++){
            if(freqMap.containsKey(a[i])){
                int val = freqMap.get(a[i]);
                val ++;
                freqMap.put(a[i], val);
            }
            else {
                freqMap.put(a[i], 1);
            }
        }
        entriesSortedByValues(freqMap);

        for (Map.Entry<Integer, Integer> e : freqMap.entrySet()) {
            int key = e.getKey();
            int value = e.getValue();
            for (int i = 0; i < value; i++) {
                System.out.print(key + " ");
            }
        }
    }

    static <K,V extends Comparable<? super V>>
    SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
                new Comparator<Map.Entry<K,V>>() {
                    @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        int res = e1.getValue().compareTo(e2.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
