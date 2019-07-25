package strings;

/**
 * @author rashmi on 2019-07-11

 */
import java.io.*;
import java.util.*;

class ConvertToAStringwhichIsRepetationOfSubstringOfLengthK{

    private static boolean checkString(String str, int k){

        int n = str.length();
        if(n%k!= 0){
            return false;
        }
        Map<String, Integer> subMap = new HashMap<String, Integer>();
        for(int i=0;i<n;i+=k){
            String sub = str.substring(i, i+k);
            if(subMap.containsKey(sub)){
                int val = subMap.get(sub);
                val++;
                subMap.put(sub, val);
            }
            else {
                subMap.put(sub, 1);
            }
        }

        if(subMap.size() == 1){
            return true;
        }
        if(subMap.size() > 2){
            return false;
        }

        int subStringWithOneCountWhichCanBeReplaced = 0;
        for(Map.Entry<String, Integer> e : subMap.entrySet()){
            if(e.getValue() ==1){
                subStringWithOneCountWhichCanBeReplaced ++;
            }
        }

        if( subStringWithOneCountWhichCanBeReplaced != 1){
            return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        int k = 2;
        boolean canReplaceOneSubString =  checkString("abababcd", k);
        System.out.println(canReplaceOneSubString ? "Yes": "No");
    }
}


