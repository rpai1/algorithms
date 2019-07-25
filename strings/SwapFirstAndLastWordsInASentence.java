package strings;

import java.io.*;
        import java.util.*;

class SwapFirstAndLastWordsInASentence{
    private static String swapWordsInASentence( char[] str){

        int i=0;
        while(i< str.length){

            int start = i;
            while( i<str.length && str[i] != ' ' ){
                i++;
            }

            char temp = str[start];
            str[start] = str[i-1];
            str[i-1] = temp;
            i++;

        }
        return new String(str);

    }
    public static void main(String args[]){

        String str1 = "geeks for geeks";
        String res = swapWordsInASentence(str1.toCharArray());

        System.out.println(res);
    }
}


