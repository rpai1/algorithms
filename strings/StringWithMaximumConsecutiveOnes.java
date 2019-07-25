package strings;

/**
 * @author rashmi on 2019-07-08

 */

import java.io.*;
        import java.util.*;

class StringWithMaximumConsecutiveOnes{
    private static String getMaximumConsecutiveOnes(String str){

        String[] sts = str.split("0");
        int maxLen = 0;
        String maxOnes = "";
        for(int i=0;i<sts.length;i++){
            if(sts[i].length() > maxLen){
                maxLen = sts[i].length();
                maxOnes = sts[i];
            }
        }

        return maxOnes;
    }

    public static void main(String args[]){
        String str = "11000111101010111";
        String st = getMaximumConsecutiveOnes(str);
        System.out.println(st);
    }
}


