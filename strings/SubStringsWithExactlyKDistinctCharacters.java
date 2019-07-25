package strings;

/**
 * @author rashmi on 2019-07-09

 */
import java.io.*;
import java.util.*;

class SubStringsWithExactlyKDistinctCharacters{
    private static int countkDist(String str, int k){
        char[] ch = str.toCharArray();

        int[] count = new int[26];
        int res =0;


        for(int i=0;i<ch.length;i++){
            int distCount =0;

            Arrays.fill(count, 0);

            for(int j=i;j<ch.length;j++){
                if(count[(ch[j]-'a')] == 0){
                    distCount++;
                    count[(ch[j]-'a')]++;
                }

                if(distCount == k){
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        String ch = "abcbaa";
        int k = 3;
        System.out.println("Total substrings with exactly " +
                k +    " distinct characters : "
                + countkDist(ch, k));
    }
}


