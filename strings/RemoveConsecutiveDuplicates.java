package strings;

/**
 * @author rashmi on 2019-07-08

 */

import java.io.*;
import java.util.*;

class RemoveConsecutiveDuplicates{

    private static String removeConsecutiveDuplicates(String str){
        int len = str.length();
        char[] res = new char[len];
        int i=0;
        int j=0;
        int k =0;
        while(i<len){
            while(i<len-1 && str.charAt(i) == str.charAt(i+1)){
                i++;
                j++;
            }
            res[k++] = str.charAt(i);
            i++;
        }

        return new String(res);
    }
    public static void main(String args[]){
        String str = "aaaaabbbbbb";
        String res = removeConsecutiveDuplicates(str);
        System.out.println(res);
    }
}


