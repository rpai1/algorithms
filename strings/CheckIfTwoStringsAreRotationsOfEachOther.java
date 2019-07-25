package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;

class CheckIfTwoStringsAreRotationsOfEachOther{
    private static boolean isRotation(String s1, String s2){

        String temp = s1+s1;
        if(temp.contains(s2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        String s1 = "ABACD";
        String s2 = "CDABA";

        System.out.println(isRotation(s1, s2) ? "1" : "0");
    }
}


