package strings;

/**
 * @author rashmi on 2019-07-09

 */

import java.io.*;
        import java.util.*;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

class MaximumSumByAddOrMul{
    private static int findMaximumValueByAdditionOrMultiplication(String str){

        char[] ch = str.toCharArray();
        int res = Character.getNumericValue(ch[0]);

        for(int i=1; i<ch.length;i++){
            System.out.println(Character.getNumericValue(ch[i]));
            if(Character.getNumericValue(ch[i]) == 0 || Character.getNumericValue(ch[i]) == 1 || res <=1){
                res = res + Character.getNumericValue(ch[i]);
            }
            else {
                res = res * Character.getNumericValue(ch[i]);
            }
        }

        return res;
    }

    public static void main(String args[]){
        String str = "01231";
        int num = findMaximumValueByAdditionOrMultiplication(str);
        System.out.println(num);
    }
}


