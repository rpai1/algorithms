package strings;

/**
 * @author rashmi on 2019-07-08

 */

import java.io.*;
        import java.util.*;

class RunlengthEncoding{
    private static void printRLE(String str){
        char[] dest = new char[str.length()];
        int k=0;
        for(int i=0;i<str.length();i++){

            int count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
            }
            dest[k++] = str.charAt(i);
            for(char c: Integer.toString(count).toCharArray()){
                dest[k++] = c;
            }
        }
        String res = new String(dest);
        System.out.println(res);

    }

    public static void main(String args[]){
        String str = "wwwwwwwwwwwwwwwwwaaadexxxxxxywww";
        printRLE(str);

    }
}


