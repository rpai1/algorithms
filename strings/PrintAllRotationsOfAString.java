package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;

class PrintAllRotationsOfAString{
    private static void printAllRotations(String str){

        String newStr = str + str;

        int n = str.length();
        for(int i=0;i<newStr.length();i++){
            if(i+n < newStr.length()){
                System.out.println(newStr.substring(i, i+n));
            }
        }
    }

    public static void main(String[] args)
    {
        String  str = new String("geeks");
        printAllRotations(str);
    }
}


