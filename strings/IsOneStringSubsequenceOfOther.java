package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
import java.util.*;

class IsOneStringSubsequenceOfOther{
    private static boolean isSubSequence(String str1, String str2, int m , int n){
        if( m==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return isSubSequence(str1, str2, m-1, n-1);
        }
        else{
            return isSubSequence(str1, str2, m, n-1);
        }
    }

    private static boolean isSubSequenceItirative(String str1, String str2, int m , int n){
        int j=0;
        for(int i=0;i<n && j<m;i++){
            if(str2.charAt(i) == str1.charAt(j)){
                j++;
            }
        }
        if(j==m){
            return true;
        }
        return false;

    }

    public static void main(String[] args)
    {
        String str1 = "gksrek";
        String str2 = "geeksforgeeks";
        int m = str1.length();
        int n = str2.length();
        boolean res = isSubSequence(str1, str2, m, n);
        boolean res2 = isSubSequenceItirative(str1, str2, m, n);
        if(res && res2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


