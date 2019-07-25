package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;

class MinimumRotationsRequiredToGetOriginalString{
    private static int findRotations(String str){
        String temp = str + str;

        int n = str.length();
        for(int i=1;i<=n;i++){
            String res = temp.substring(i, str.length());
            System.out.println(res + " "+ str+ " "+ temp);
            if(res ==str){
                return i;
            }
        }

        return n;
    }

    public static void main(String[] args)
    {
        String  str = new String("geeks");
        System.out.println(findRotations(str));
    }
}


