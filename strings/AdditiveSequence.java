package strings;

/**
 * @author rashmi on 2019-07-08

 */

//Not done yet
import java.io.*;
import java.util.*;

class AdditiveSequence{
    private static Deque<String> additiveSequence(String num){
        int n = num.length();
        Deque<String> res = new LinkedList<String>();
        for(int i=0; i<=n/2; i++){
            for(int j=i+1; j<=n/2; j++){

                String a = num.substring(0, i+1);
                String b = num.substring(i+1, j+1);
                String c = num.substring(j+1, n);
                // assuming that you get the sequence, add this since this wont be added by the recursive method.
                // you can use queue and do addFirst / addLast to avoid doing this so the order is maintained.
                if(checkAddition(res,a , b, c)){
                    res.addFirst(b);
                    res.addFirst(a);
                    return res;
                }
                else{
                    res.removeAll(Arrays.asList(a,b));
                }
            }
        }

        return res;
    }

    private static boolean checkAddition(Deque<String> res, String a, String b, String c){

        Integer sumInt = Integer.parseInt(a) + Integer.parseInt(b);

        String sum = Integer.toString(sumInt);

        if(sum.length() == c.length() && sum.equals(c)){
            res.addLast(sum);
            return true;
        }

        if(c.length() < sum.length() || sum.compareTo(c.substring(0, sum.length())) != 0){
            return false;
        }
        else {
            res.addLast(sum);
            return checkAddition(res, b, sum, c.substring(sum.length(), c.length()));
        }

    }

    public static void main(String args[]){
        String num = "11235813";
        Deque<String> res = additiveSequence(num);
        for(String str: res){
            System.out.println("final array is:"+str);
        }
    }
}


