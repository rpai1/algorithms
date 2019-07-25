package strings;

/**
 * @author rashmi on 2019-07-08

 */
import java.io.*;
        import java.util.*;

class PrintStringsContainingSamepRefix{
    private static void printStringsContainingPrefix(String[] strs, String prefix){

        int startingIndexPrefix = 0;
        int endingEndexPrefix = prefix.length()-1;
        char startingCharPrefix = prefix.charAt(0);
        char endingCharPrefix = prefix.charAt(prefix.length()-1);
        for(String st : strs){
            if(st.contains(prefix) && st.indexOf(startingCharPrefix) == startingIndexPrefix
                    && st.indexOf(endingCharPrefix) == endingEndexPrefix && isTheSameWord(prefix, st.substring(startingIndexPrefix,endingEndexPrefix+1 ))){
                System.out.println(st);
            }
        }
    }

    private static boolean isTheSameWord(String s1, String s2){
        // System.out.println(s1 + " "+ s2);
        if(s1.compareTo(s2) == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){

        String[] strs = {"geeksforgeeks","forgeeks","geeks","eeksfor"};
        String prefix = "geeks";
        printStringsContainingPrefix(strs, prefix);

    }
}


