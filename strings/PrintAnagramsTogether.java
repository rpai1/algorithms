package strings;

/**
 * @author rashmi on 2019-07-08

 */
import java.io.*;
        import java.util.*;

class PrintAnagramsTogether{

    private static void printAnagrams( String[] str){

        HashMap<String, ArrayList<String>> wordAnagramMap = new HashMap<String, ArrayList<String>>();

        for(String s: str){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String anagramBase = new String(chars);
            if(wordAnagramMap.containsKey(anagramBase)){
                ArrayList<String> values = wordAnagramMap.get(anagramBase);
                values.add(s);
                wordAnagramMap.put(anagramBase, values);
            }
            else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(s);
                wordAnagramMap.put(anagramBase, list);
            }
        }

        for(Map.Entry<String, ArrayList<String>> entry : wordAnagramMap.entrySet()){
            System.out.println(entry.getValue());
        }

    }
    public static void main(String args[]){

        String arr[] = { "cat", "dog", "tac", "god", "act" };
        printAnagrams(arr);
    }
}


