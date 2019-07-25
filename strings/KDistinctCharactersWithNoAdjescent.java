package strings;

/**
 * @author rashmi on 2019-07-09

 */

import java.io.*;
        import java.util.*;

class KDistinctCharactersWithNoAdjescent{
    private static String kDistinctCharacterWithNoAdjescent(int n, int k){

        String res = "";

        for(int i=0;i<k;i++){
            res = res + (char)('a'+i);
        }

        int count =0;
        for(int i=0;i<n-k;i++){
            res = res + (char)('a'+ count);
            count ++;
            if(count == k){
                count =0;
            }
        }

        return res;

    }

    public static void main(String[] args)
    {
        int n = 10, k = 5;

        System.out.println(kDistinctCharacterWithNoAdjescent(n, k));
    }
}


