package strings;

/**
 * @author rashmi on 2019-07-10

 */
import java.io.*;
        import java.util.*;
// no duplicates ; use count array to avoid printing duplicates
class PrintAllPermutations{
    private static void printDistinctPermutn(String str, String res){

        if(str.length() == 0){
            System.out.print(res+ " ");
            return;
        }
        boolean alpha[] = new boolean[26];

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);
            String restOfTheString =  str.substring(0,i) + str.substring(i+1);

            if(alpha[ch-'a']==false){
                printDistinctPermutn(restOfTheString, res+ch);
                alpha[ch-'a'] = true;
            }
        }
    }

    public static void main(String[] args)
    {
        String s = "geek";
        printDistinctPermutn(s, "");
    }
}



