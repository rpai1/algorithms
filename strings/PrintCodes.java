package strings;

/**
 * @author rashmi on 2019-07-16

 */
import java.io.*;
import java.util.*;

class PrintCodes {

    private static void findAllCodes(String str, char[] res, int i, int j, int n, HashMap<Integer, Character> cMap){
        if(i==n){
            // System.out.println("here");
            String temp1 = new String(res).replaceAll(String.valueOf((char) 0), "");
            printCodes(temp1, cMap);
            return;
        }

        res[j] = str.charAt(i);
        findAllCodes(str, res, i+1, j+1, n, cMap);

        res[j] = ' ';
        res[j+1] = str.charAt(i);
        findAllCodes(str, res, i+1, j+2, n, cMap);
    }

    private static void printCodes(String temp, HashMap<Integer, Character> cMap){

        String[] splitTemp = temp.split(" ");
        for(String s: splitTemp){
            int sToInt = Integer.parseInt(s);
            // System.out.println(s + " "+ sToInt);
            if(cMap.containsKey(sToInt)){
                System.out.print(cMap.get(sToInt));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "226";
        HashMap<Integer, Character> cMap = new HashMap<Integer, Character>();
        for(int i=1; i<=26;i++){
            cMap.put(i, (char)(i-1+'A'));
        }
        // System.out.println(cMap);
        char[] temp = new char[str.length()*2];
        temp[0] = str.charAt(0);
        findAllCodes(str, temp, 1, 1, str.length(), cMap);
    }
}
