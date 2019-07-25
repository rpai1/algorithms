package strings;

/**
 * @author rashmi on 2019-07-09

 */

import java.io.*;
        import java.util.*;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

class MaximumNumberInAString{
    private static int findMaximumNumercvalue(String str){

        int max = Integer.MIN_VALUE;

        String regex = "\\d+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while(m.find()){
            int num = Integer.parseInt(m.group());
            if(num > max){
                max = num;
            }
        }
        return max;

    }

    public static void main(String args[]){
        String str = "100klh564abc365bg";
        int num = findMaximumNumercvalue(str);
        System.out.println(num);
    }
}


