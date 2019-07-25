package strings;

/**
 * @author rashmi on 2019-07-08

 */
import java.io.*;
        import java.util.*;

class MinimumSumOfSquaresOfCharacterCounts{
    private static int minStringValue(String str, int k){

        char[] chars = str.toCharArray();

        int[] count = new int[26];
        for(int i=0;i<chars.length;i++){
            count[chars[i]-'a']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i=0;i<26;i++){
            if(count[i] != 0){
                pq.add(count[i]);
            }
        }
        System.out.println(pq);

        while( k >0){
            int l = pq.poll();
            l--;
            pq.add(l);
            k--;
        }
        int res = 0;

        while(!pq.isEmpty()){
            int ele = pq.peek();
            res = res + (ele*ele);
            pq.poll();
        }

        return res;

    }

    public static void main(String args[]){
        String str = "abbccc";   // Input 1
        int k = 2;
        System.out.println(minStringValue(str, k));

        str = "aaab";           // Input 2
        k = 2;
        System.out.println(minStringValue(str, k));
    }
}


