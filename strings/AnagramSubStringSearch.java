package strings;

/**
 * @author rashmi on 2019-07-11

 */
import java.io.*;
import java.util.*;

class AnagramSubStringSearch{

    private static void search(String pat, String txt){

        int[] countPat = new int[256];
        int[] countTxt = new int[256];

        int m = txt.length();
        int n = pat.length();

        for(int i=0;i<n;i++){
            countPat[pat.charAt(i)-'A']++;
            countTxt[txt.charAt(i)-'A']++;
        }

        for(int i=n;i<m;i++){

            if(compare(countPat, countTxt)){
                System.out.println("found at index" + (i-n));
            }
            countTxt[txt.charAt(i-n)-'A']--;
            countTxt[txt.charAt(i)-'A']++;
        }

        if(compare(countPat, countTxt)){
            System.out.println("found at index" + (m-n));
        }
    }

    private static boolean compare(int[] pat, int[] txt){
        for(int i=0;i<256;i++){
            if(pat[i]!=txt[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String txt = "BACDGABCDA";
        String pat = "ABCD";
        search(pat, txt);
    }
}


