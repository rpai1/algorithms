package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
import java.util.*;

class LargestWordInTheDictionaryThatCanBeConstructedBYRemovingCharactersInGivenString{
    private static String findLongestString(String[] str, String pat){

        int maxLen = Integer.MIN_VALUE;
        String res = "";

        for(String word : str){
            if(word.length() > maxLen && isSubsequence(word, pat)){
                maxLen = word.length();
                res = word;
            }
        }
        return res;
    }
    private static boolean isSubsequence(String str1 , String str2){

        // System.out.println(str1 + " "+ str2);
        int m = str1.length();
        int n= str2.length();
        if( n==0){
            return false;
        }

        int j=0, i=0;
        for(i=0;i<n && j<m ;i++){
            if(str1.charAt(j) == str2.charAt(i)){
                j++;
            }
        }
        // System.out.println(j + " "+ i + " "+ m + " "+ n);
        if( j== m){
            return true;
        }
        return false;

    }

    public static void main(String[] args)
    {
        String[] arr = {"ale", "apple", "monkey", "plea"};
        String str = "abpcplea";
        System.out.println(findLongestString(arr, str));
    }
}


