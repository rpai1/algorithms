package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;

class ReverseWordsInAString{
    private static void reverseWords(String s, int n){

        String[] temp = s.split(" ");

        String res = "";
        for(int i=0;i<temp.length;i++){
            res = res + " " + reverse(temp[i].toCharArray());
        }
        System.out.println(res);
    }

    private static String reverse(char[] str){
        int n = str.length;
        int l=0, h=n-1;
        while(l<h){
            char temp = str[l];
            str[l] = str[h];
            str[h] = temp;
            l++;
            h--;
        }

        return new String(str);
    }

    public static void main(String[] args)
    {
        String s1 = "Hello World";
        reverseWords(s1, s1.length());

    }
}


