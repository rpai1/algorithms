package strings;

/**
 * @author rashmi on 2019-07-08

 */

import java.io.*;
        import java.util.*;

class ReverseWordsInAGivenStringSingleSpace{

    private static String reverseWordsInAGivenString( String str){

        String[] temp = str.split(" ");
        String res = "";

        for(int i=0;i<temp.length; i++){

            if(i == temp.length-1){
                res = temp[i] + res;
            }
            else {
                res = " " + temp[i] + res;
            }
        }

        return res;
    }
    public static void main(String args[]){

        String str1 = "welcome to geeks for geeks";
        String result = reverseWordsInAGivenString(str1);
        System.out.println(result);
    }
}


