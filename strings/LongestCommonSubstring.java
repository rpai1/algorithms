package strings;

/**
 * @author rashmi on 2019-07-08

 */

import java.io.*;
        import java.util.*;

class LongestCommonSubstring{

    private static String printLongestCommonSubString(String s1, String s2){

        int m = s1.length();
        int n = s2.length();

        int row = 0;
        int col = 0;
        int len = 0;
        String result = "";

        int res[][] = new int[m+1][n+1];

        for(int i=0; i<=m ;i++){
            for(int j=0;j<=n;j++){
                if( i== 0 || j==0){
                    res[i][j] = 0;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    res[i][j] = res[i-1][j-1]+1;
                    if( res[i][j] > len){
                        len = res[i][j];
                        row = i;
                        col = j;
                    }
                }
                else {
                    res[i][j] = 0;
                }
            }
        }

        if( len == 0){
            System.out.println("No common substring");
        }

        else {
            System.out.println("Length of the longest substring is: "+len);
            while(res[row][col] != 0){
                result = s1.charAt(row-1) + result; // or s2.charAt(col)
                row--;
                col--;
            }
        }

        return result;

    }
    public static void main(String args[]){
        String X = "OldSite:GeeksforGeeks.org";
        String Y = "NewSite:GeeksQuiz.com";
        String result = printLongestCommonSubString(X, Y);
        System.out.println(result);
    }
}


