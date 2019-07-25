package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;

class LongestSubsequenceWhereEveryCharAppearsAtLeastKTimes{
    private static void longestSubseqWithK(String str, int k){
        int[] count = new int[26];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)- 'a']++;
        }

        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)-'a'] >=k){
                System.out.print(str.charAt(i));
            }
        }
    }

    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        int k = 2;
        longestSubseqWithK(str, k);
    }
}


