package strings;

/**
 * @author rashmi on 2019-07-08

 */
import java.io.*;
        import java.util.*;

class CheckIgStringCanBeEmptyAfterSubstringDeleteion{
    private static boolean canBecomeEmpty(String str, String sub){

        if(!str.contains(sub)){
            return false;
        }
        while(str.length() > 0){
            int index = str.indexOf(sub);
            if(index == -1){
                return false;
            }
            str = str.replace(sub, "");
        }

        if(str.length() == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        String str = "GEEGEEKSKS", sub_str = "GEEKS";
        if (canBecomeEmpty(str, sub_str)) {
            System.out.print("\nYes");
        } else {
            System.out.print("\nNo");
        }

    }
}


