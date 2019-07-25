package strings;

/**
 * @author rashmi on 2019-07-08

 */
import java.io.*;
        import java.util.*;

class SecondMostRepeatedWord{
    private static String secondMostRepeatedWord(String[] str){

        HashMap<String, Integer> count = new HashMap<String, Integer>();

        for(int i=0;i<str.length;i++){
            if(count.containsKey(str[i])){
                int value = count.get(str[i]);
                value ++;
                count.put(str[i], value);

            }
            count.put(str[i], 1);
        }

        int firstMax = 0;
        String fstMaxString= "";
        int secondmax = 0;
        String secMaxString="";

        for(Map.Entry<String, Integer> entry: count.entrySet()){
            int value = entry.getValue();
            if( value > firstMax && value > secondmax ){
                secondmax = firstMax;
                secMaxString = fstMaxString;
                firstMax = value;
                fstMaxString = entry.getKey();
            }
            else if (value > secondmax){
                secondmax = value;
                secMaxString = entry.getKey();
            }
        }

        return secMaxString;

    }

    public static void main(String args[]){
        String arr[] = { "ccc", "aaa", "ccc",
                "ddd", "aaa", "aaa" };

        String str = secondMostRepeatedWord(arr);
        System.out.println(str);

    }
}


