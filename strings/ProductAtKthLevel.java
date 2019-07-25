package strings;

/**
 * @author rashmi on 2019-07-09

 */
import java.io.*;
import java.util.*;

class ProductAtKthLevel{
    private static int productAtKthLevel(String tree, int k){

        int level = -1;

        int res = 1;

        for(int i=0;i<tree.length();i++){
            if( tree.charAt(i) == '('){
                level++;
            }
            else if(tree.charAt(i) == ')'){
                level--;
            }
            else {
                if(level == k){
                    res = res * (tree.charAt(i)-'0');
                }
            }
        }

        return res;
    }

    public static void main(String[] args)
    {
        String tree = "(0(5(6()())(4()(9()())))(7(1()())(3()())))";
        int k = 2;
        System.out.println(productAtKthLevel(tree, k));
    }
}


