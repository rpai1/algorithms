package strings;

/**
 * @author rashmi on 2019-07-08

 */
import java.io.*;
        import java.util.*;

class CheckIfOneStringCanBeMadeFromAnotherByDeletionOrRearrangement{
    private static boolean makeOneStringFromAnotherByDeletionAndRearrangement(String s1, String s2){

        int m = s1.length();
        int n = s2.length();
        String smallerString = m > n ? s2: s1;
        String longerString = m > n? s1: s2;
        int count =0;

        int[] chars = new int[26];

        for(int i=0;i<smallerString.length(); i++){
            chars[smallerString.charAt(i)-'a']++;
        }

        for(int i=0;i<longerString.length(); i++){
            if(chars[longerString.charAt(i)-'a'] >0){
                count ++;
            }
            chars[longerString.charAt(i)-'a']--;
        }

        if(count != smallerString.length()){
            return false;
        }

        return true;
    }

    public static void main(String args[]){
        String s1 = "geeksforgeeks",
                s2 = "rteksfogrdsskgeggehes";

        boolean isPossible = makeOneStringFromAnotherByDeletionAndRearrangement(s1.toLowerCase(), s2.toLowerCase());
        System.out.println(isPossible);

    }
}


