package strings;

/**
 * @author rashmi on 2019-07-16

 */
import java.io.*;
import java.util.*;

class PlaindromepartitionMinNumberOfCuts {

    private static int minPalPartion(String str, int i, int j, int n, int min ){

        if( i==j){
            return 0;
        }

        if(j==i+1){
            if(str.charAt(i) == str.charAt(j)){
                return 0;
            }
            return 1;
        }

        if(isPalindrome(str, i, j)){
            return 0;
        }

        for(int k=i; k<j;k++){
            int requiredPartitions = minPalPartion(str, i, k, n, min)
                    + minPalPartion(str, k+1, j, n, min)+1;
            if(requiredPartitions<min){
                min = requiredPartitions;
            }
        }
        return min;
    }

    private static boolean isPalindrome(String str, int start, int end){
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ababbbabbababa";
        int nums = minPalPartion(str, 0, str.length()-1, str.length(), Integer.MAX_VALUE);
        System.out.println("Min cuts needed for "+ "Palindrome Partitioning" + " is:" +nums  );
    }
}
