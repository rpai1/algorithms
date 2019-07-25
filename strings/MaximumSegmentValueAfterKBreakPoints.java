package strings;

/**
 * @author rashmi on 2019-07-09

 */

import java.io.*;
import java.util.*;

//The idea is after K breakpoints,
// the max length of substring you will have is n-k; so we need to check the substring of width n-k to find a max
class MaximumSegmentValueAfterKBreakPoints{
    private static int segmentValueAfterBreakPoints(String str, int k){

        int n = str.length();
        Integer max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            String subString = str.substring(i, Math.min(i+n-k, n));
            // System.out.println(subString + " "+ i);
            Integer num = Integer.parseInt(subString);
            if( num > max){
                max = num;
            }
        }
        return max;
    }

    public static void main(String args[]){
        String str = "8754";
        int k = 2;
        int num = segmentValueAfterBreakPoints(str, k);
        System.out.println(num);
    }
}


