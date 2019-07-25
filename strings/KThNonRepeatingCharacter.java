package strings;

/**
 * @author rashmi on 2019-07-08

 */
import java.io.*;
        import java.util.*;

class KThNonRepeatingCharacter{

    private static char getKthNonRepeatingCharacter(String str, int k){

        char[] chars = str.toCharArray();

        int[] count = new int[26];

        for(int i=0;i<chars.length;i++){
            count[chars[i] - 'a'] ++;
        }

        int uniquecount = 0;

        for(int i=0;i<chars.length; i++){
            if(count[chars[i]-'a'] == 1){
                uniquecount ++;
            }
            if(uniquecount == k){
                return chars[i];
            }
        }
        return '0';
    }

    public static void main(String args[]){

        String str = "geeksforgeeks";
        int k =3;
        char c = getKthNonRepeatingCharacter(str, k);
        System.out.println(c);
    }
}


