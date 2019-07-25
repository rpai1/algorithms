package strings;

/**
 * @author rashmi on 2019-07-15

 */
import java.io.*;
import java.util.*;

class MinimumInsertionsToMakeAStringpalindrome {
    private static int  findMinInsertions(char[] str, int l, int h){
        if( l>h){
            return Integer.MAX_VALUE;
        }
        if( l==h){
            return 0;
        }
        if( l== h-1)
            return str[l] == str[h] ? 0 : 1;


        return str[l] == str[h] ? findMinInsertions(str, l+1, h-1) :
                Math.min(findMinInsertions(str, l+1, h), findMinInsertions(str, l, h-1))+1;
    }
    public static void main(String[] args) {
        String str= "AACECAAAA";
        System.out.println(findMinInsertions(str.toCharArray(),
                0, str.length()-1));
    }
}
