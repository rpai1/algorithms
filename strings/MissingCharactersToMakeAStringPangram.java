package strings;

/**
 * @author rashmi on 2019-07-08

 */
import java.io.*;
import java.util.*;

class MissingCharactersToMakeAStringPangram{

    private static ArrayList<Character> getMissingCharacters(String str){

        boolean[] visited = new boolean[26];

        int index = -1;
        for(int i=0;i<str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                index = str.charAt(i) - 'A';
            }

            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                index = str.charAt(i) - 'a';
            }

            visited[index] = true;
        }

        ArrayList<Character> missingChars = new ArrayList<>();

        for(int i=0;i<26;i++){
            if(visited[i]== false){
                missingChars.add( (char)(i + 'a'));
            }
        }

        return missingChars;
    }

    public static void main(String args[]){
        String str = "The quick brown fox jumps over the dog";

        ArrayList<Character> chars = getMissingCharacters(str);

        for( Character c : chars){
            System.out.println(c);
        }
    }
}


