package strings;

/**
 * @author rashmi on 2019-07-11

 */
import java.io.*;
        import java.util.*;

class SortArrayBasedOnStringLength{
    private static void sort(String[] arr, int n){

        Arrays.sort(arr , new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        });

        for(String s: arr){
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args)
    {
        String []arr = {"GeeksforGeeks", "I", "from", "am"};
        int n = arr.length;
        sort(arr,n);
    }
}


