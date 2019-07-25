package strings;

import java.io.*;
        import java.util.*;

class StringBasedOnnewCharacterSet{

    private static String getStringBasedOnNewCharacterSet(String str, char[] charSet){

        Map<Character, Character> charMap = new HashMap<Character, Character>();

        for(int i=0; i<26; i++){
            charMap.put(charSet[i], (char)(i + 'a'));
        }

        System.out.println(charMap);

        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            res = res.append(charMap.get(str.charAt(i)));
        }
        return res.toString();

    }

    public static void main(String args[]){
        String newCharacterSet = "qwertyuiopasdfghjklzxcvbnm";
        String str = "egrt";
        String res = getStringBasedOnNewCharacterSet(str, newCharacterSet.toCharArray());
        System.out.println(res);
    }
}


