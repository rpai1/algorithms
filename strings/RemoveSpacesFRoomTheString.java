package strings;

import java.io.*;
        import java.util.*;

class RemoveSpacesFRoomTheString{
    private static String removeSpacesFromTheString(String str){

        StringBuilder chars = new StringBuilder();

        int i=0;
        int j = 0;

        while(i< str.length()){

            if(str.charAt(i) != ' '){
                chars.append(str.charAt(i));
                i++;
                j++;
            }
            else{
                i++;
            }
        }

        return chars.toString();

    }

    public static void main(String args[]){

        String str1 = "ab c        d";

        String res = removeSpacesFromTheString(str1);
        System.out.println(res);
    }
}


