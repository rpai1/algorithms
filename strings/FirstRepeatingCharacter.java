package strings;

/**
 * @author rashmi on 2019-07-11

 */
import java.io.*;
import java.util.*;

class FirstRepeatingCharacter{

    private static Character firstRepeating(String str){

        int[] count = new int[26];
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)-'a'] !=0){
                return str.charAt(i);
            }
            else{
                count[str.charAt(i)-'a']++;
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println(firstRepeating(str));
    }
}


