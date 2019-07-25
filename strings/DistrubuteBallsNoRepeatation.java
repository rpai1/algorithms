package strings;

/**
 * @author rashmi on 2019-07-11

 */
import java.io.*;
        import java.util.*;

class DistrubuteBallsNoRepeatation{

    private static boolean distributingBalls(int k, int n, String str){

        int[] count = new int[26];

        for(int i=0;i<n;i++){
            count[str.charAt(i) - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(count[i] > k){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int n = 6, k = 3;
        String str = "aacaab";
        boolean canDistribute = distributingBalls(k, n, str);

        if (canDistribute)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}



