package strings;

/**
 * @author rashmi on 2019-07-11

 */
import java.io.*;
        import java.util.*;

class PrintAlternateCharacters{

    private static void printStringAlternate(String str){

        int[] count = new int[256];
        for(int i=0;i<str.length();i++){

            if(count[str.charAt(i)]%2 == 0){
                System.out.print(str.charAt(i));
            }
            count[str.charAt(i)]++;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        String str1 = "Geeks for geeks";
        String str2 = "It is a long day Dear";
        printStringAlternate(str1);
        printStringAlternate(str2);
    }
}


