package strings;

/**
 * @author rashmi on 2019-07-11

 */
import java.io.*;
import java.util.*;

class FirstNonRepeatingCharacter{

    private static void findFirstNonRepeating(String str){

        char[] s = str.toCharArray();

        boolean[] repeated = new boolean[256];

        List<Character> nonRepeatedList = new LinkedList<Character>();
        Arrays.fill(repeated, false);

        for(Character ch : s){
            if(repeated[ch] == true){
                continue;
            }
            else{
                if(nonRepeatedList.contains(ch)){
                    repeated[ch] = true;
                    nonRepeatedList.remove(ch);
                }
                else{
                    nonRepeatedList.add(ch);
                }
            }

            if(nonRepeatedList.size() !=0){
                System.out.println(nonRepeatedList.get(0));
            }
        }
    }

    public static void main(String[] args)
    {
        String stream = "geeksforgeeksandgeeksquizfor";
        findFirstNonRepeating(stream);
    }
}


