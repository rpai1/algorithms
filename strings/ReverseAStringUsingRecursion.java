package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;

class ReverseAStringUsingRecursion{
    private static void reverseUsingRecursion(String s, int n){

        if(s == null || n==0){
            return;
        }
        else {
            System.out.print(s.charAt(n-1));
            reverseUsingRecursion(s, n-1);
        }

    }

    public static void main(String[] args)
    {
        String s1 = "Rashmi";
        reverseUsingRecursion(s1, s1.length());

    }
}


