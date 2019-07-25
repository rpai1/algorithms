package strings;

/**
 * @author rashmi on 2019-07-15

 */
import java.io.*;
import java.util.*;

class IsStringRotationOfAPalindrome {
    private static String longestPalindrominSubstring(String str, int n){

        int max = 0,  index =0;
        for(int i=0;i<n;i++){
            int l1 = explandInThemIddle(str,i,i);
            int l2 = explandInThemIddle(str,i, i+1);
            if(Math.max(l1, l2)>max){
                max = Math.max(l1, l2);
                index = l1>l2 ? i-l1/2 : i - l2 / 2 + 1;
            }
        }
        return str.substring(index, index+max);
    }

    private static int explandInThemIddle(String str, int left, int right){
        while(left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left --;
            right ++;
        }

        return right-left-2+1; // -2 to decrease increased counts of previous itiration
    }

    private static boolean isRotationOfPalindrome(String str){

        String temp = str+str;

        String longestPalindrome = longestPalindrominSubstring(temp, temp.length());

        if(longestPalindrome != null && longestPalindrome.length()>1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "babad";
        String res = longestPalindrominSubstring(str, str.length());
        System.out.println(res);

        String str2 = "aaaab";
        boolean res2 = isRotationOfPalindrome(str2);
        System.out.println(res2);
    }
}
