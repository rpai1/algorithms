package strings;

/**
 * @author rashmi on 2019-07-09

 */
import java.io.*;
        import java.util.*;

class CountSubstringsWithSameStartAndEndCharacters{
    private static int countSubstrsWithSameStartAndEndCharacters(char[] str , int i,
                                                                 int j, int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int res = countSubstrsWithSameStartAndEndCharacters(str, i+1, j, n-1) +
                countSubstrsWithSameStartAndEndCharacters(str, i, j-1, n-1) -
                countSubstrsWithSameStartAndEndCharacters(str, i+1, j-1, n-2);
        if(str[i] == str[j]){
            res++;
        }
        return res;
    }

    public static void main(String[] args)
    {
        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstrsWithSameStartAndEndCharacters(str.toCharArray(), 0, n - 1, n));
    }
}



