package strings;

/**
 * @author rashmi on 2019-07-11

 */

import java.io.*;
        import java.util.*;

class PrintAllPossibleSTringsByPlacingSpaces{

    private static void printPattern(String str, int i, int j, char[] temp, int n){

        if( i== n){
            //you need this or /0 to tell temp that the string has ended. make sure to add this.
            temp[j] = ' ';
            System.out.println(new String(temp));
            return;
        }

        temp[j] =  str.charAt(i);
        printPattern(str, i+1, j+1, temp, n);

        temp[j] = ' ';
        temp[j+1] = str.charAt(i);
        printPattern(str, i+1, j+2, temp, n);

    }

    public static void main(String[] args)
    {
        String str = "ABCD";
        char[] temp = new char[2*str.length()];
        temp[0] = str.charAt(0);
        printPattern(str, 1, 1,temp, str.length());
    }
}


