package strings;

/**
 * @author rashmi on 2019-07-15

 */
import java.io.*;
        import java.util.*;

class ANagramSubstringsCount {
    private static int anagramSubstringsCount(String str){

        int[] count = new int[26];
        Map<Character, Integer> cMap = new HashMap<Character, Integer>();

        for(int i=0;i<str.length();i++){
            if(cMap.containsKey(str.charAt(i))){
                cMap.put(str.charAt(i), cMap.get(str.charAt(i))+ 1);
            }
            else{
                cMap.put(str.charAt(i),1 );
            }
        }

        System.out.println(cMap);
        int anCount =0;
        for(Map.Entry<Character, Integer> e: cMap.entrySet()){
            anCount = anCount + e.getValue()*(e.getValue()-1)/2;
        }

        return anCount;
    }
    public static void main(String[] args) {
        int k = anagramSubstringsCount("xyyx");
        System.out.println(k);
    }
}
