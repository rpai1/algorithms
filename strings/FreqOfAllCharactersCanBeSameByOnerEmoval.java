package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
import java.util.*;

class FreqOfAllCharactersCanBeSameByOnerEmoval{
    private static boolean canBeTheSame(String str){
        int[] count = new int[26];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i) - 'a'] ++;
        }

        HashMap<Integer, ArrayList<Character>> freqMap = new HashMap<Integer, ArrayList<Character>>();

        for(int i=0; i< 26; i++){
            if(count[i]!=0){
                if(freqMap.containsKey(count[i])){
                    ArrayList<Character> chars = freqMap.get(count[i]);
                    chars.add((char)(i + 'a'));
                    freqMap.put(count[i],chars);
                }
                else {
                    ArrayList<Character> chars = new ArrayList<>();
                    chars.add((char)(i + 'a'));
                    freqMap.put(count[i],chars);
                }
            }
        }

        System.out.println(freqMap);

        if(freqMap.size() > 2){
            return false;
        }
        else {
            int[] temp = new int[2];
            int l =0;
            for(Integer i : freqMap.keySet()){
                temp[l] = i;
                l++;
            }
            for(int i=1;i<temp.length;i++){
                if(Math.abs(temp[i-1]-temp[i]) >1){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args)
    {
        String s = "xyyzz";
        System.out.println(canBeTheSame(s));
    }
}


