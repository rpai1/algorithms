package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;

class CountAlphabetsAsEqualDistanceAsEnglishAlphabets{
    private static int countCharacterPairs(String s){

        int count =0;
        for(int i=0;i<s.length();i++){
            for(int j=1; i+j<s.length() && j<26; j++){
                if(Math.abs(s.charAt(i+j) - s.charAt(i)) == j){
                    count ++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        String s = "observation";
        System.out.println(countCharacterPairs(s));
    }
}


