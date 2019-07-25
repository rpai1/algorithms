package strings;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class PangramChecking {

    private static boolean checkIsPangram( String str){

        boolean[] visited = new boolean[26];



        char[]  characters = str.toCharArray();
        int index = -1;;
        for(int i=0;i<characters.length; i++){
            if(characters[i] >= 'A' && characters[i] <= 'Z'){
                index = characters[i] - 'A';
            }
            else  if(characters[i] >= 'a' && characters[i] <= 'z'){
                index = characters[i] - 'a';
            }
            // System.out.println(index);

            visited[index] = true;
        }

        for(int i=0;i<25;i++){
            if(visited[i] == false){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkIsPangram(str);

        System.out.println(" is pangram " + isPangram);
    }
}
