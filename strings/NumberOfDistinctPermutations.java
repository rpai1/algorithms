package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
import java.util.*;

class NumberOfDistinctPermutations{
    // dsitinct permutations = (length!/ multiplication of freqOfEachCharacter!)
    private static int findDistinctPermutations(String str){

        int n = str.length();

        int[] count = new int[26];
        for(int i=0;i<n;i++){
            count[(str.charAt(i) - 'a')]++;
        }

        int res=1;
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                res = res * factorial(count[i]);
            }
        }

        return factorial(n)/res;
    }

    private static int factorial(int n){
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        String str = "fvvfhvgv";
        int n = findDistinctPermutations(str);
        System.out.println(n);
    }
}


