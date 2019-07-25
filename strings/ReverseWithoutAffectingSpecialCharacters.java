package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;

class ReverseWithoutAffectingSpecialCharacters{
    private static void reverseWithoutAffectingSpecialCharacters(String s, int n){

        char[] chars = s.toCharArray();

        int i=0;
        int j = n-1;

        while(i<j){
            if(!Character.isAlphabetic(chars[i])){
                i++;
            }
            else if(!Character.isAlphabetic(chars[j])){
                j--;
            }
            else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(new String(chars));
    }

    public static void main(String[] args)
    {
        String s1 = "Ab,c,de!$";
        reverseWithoutAffectingSpecialCharacters(s1, s1.length());

    }
}


